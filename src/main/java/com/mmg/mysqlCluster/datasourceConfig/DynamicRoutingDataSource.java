package com.mmg.mysqlCluster.datasourceConfig;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @Author: fan
 * @Date: 2023/9/22
 * @Description:
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {
    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDBName();
    }
}
