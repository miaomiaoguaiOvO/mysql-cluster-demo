package com.mmg.mysqlCluster.datasourceConfig;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: fan
 * @Date: 2023/9/22
 * @Description:
 */
@Slf4j
public class DynamicDataSourceHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    private static final String MASTER_DB = "master";
    private static final List<String> SLAVE_DBS = Arrays.asList("slave01", "slave02");

    public static String getDBName() {
        String db = contextHolder.get();
        if (db == null) {
            db = "master";
        }
        return db;
    }

    public static void setDBType(DBEnum type) {
        if (DBEnum.WRITE.equals(type)) {
            log.info("数据源为 " + MASTER_DB);
            contextHolder.set(MASTER_DB);
        } else {
            String dbName = SLAVE_DBS.get(incrementAndGetModulo(SLAVE_DBS.size()));
            log.info("数据源为 " + dbName);
            contextHolder.set(dbName);
        }
    }

    public static void clearDBType() {
        contextHolder.remove();
    }

    //轮询
    private static final AtomicInteger nextSlaveCyclicCounter = new AtomicInteger(0);

    private static int incrementAndGetModulo(int modulo) {
        for (; ; ) {
            int current = nextSlaveCyclicCounter.get();
            int next = (current + 1) % modulo;
            if (nextSlaveCyclicCounter.compareAndSet(current, next)) return next;
        }
    }
}
