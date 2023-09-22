package com.mmg.mysqlCluster.datasourceConfig;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.keygen.SelectKeyGenerator;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.Locale;

/**
 * @Author: fan
 * @Date: 2023/9/22
 * @Description:
 */
@Slf4j
//指定拦截哪些方法,update包括增删改
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})
})
public class DynamicDataSourceInterceptor implements Interceptor {
    private static final String REGEX = ".*insert\\u0020.*|.*delete\\u0020.*|.*update\\u0020.*";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        boolean synchronizationActive = TransactionSynchronizationManager.isActualTransactionActive();
        DBEnum lookupKey = DBEnum.WRITE;
        if (!synchronizationActive) {
            Object[] objects = invocation.getArgs();
            MappedStatement ms = (MappedStatement) objects[0];
            if (ms.getSqlCommandType().equals(SqlCommandType.SELECT)) {
                //如果selectKey为自增id查询主键,使用主库
                if (!ms.getId().contains(SelectKeyGenerator.SELECT_KEY_SUFFIX)) {
                    BoundSql boundSql = ms.getSqlSource().getBoundSql(objects[1]);
                    String sql = boundSql.getSql().toLowerCase(Locale.CHINA).replaceAll("[\\t\\n\\r]", " ");
                    if (!sql.matches(REGEX)) {
                        lookupKey = DBEnum.READ;
                    }
                }
            }
        }
        DynamicDataSourceHolder.setDBType(lookupKey);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        //增删改查的拦截，然后交由intercept处理
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

}
