package com.mmg.mysqlCluster.datasourceConfig;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fan
 * @Date: 2023/9/22
 * @Description:
 */
@Configuration
public class DynamicDataSourceConfig {

    /**
     * 配置数据源
     */
    @Bean(name = "master")
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource master() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "slave01")
    @ConfigurationProperties(prefix = "spring.datasource.slave01")
    public DataSource slave01() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "slave02")
    @ConfigurationProperties(prefix = "spring.datasource.slave02")
    public DataSource slave02() {
        return DataSourceBuilder.create().build();
    }


    @Primary
    @Bean(name = "dynamicDataSource")
    public DynamicRoutingDataSource dataSource(@Qualifier("master") DataSource master,
                                               @Qualifier("slave01") DataSource slave01,
                                               @Qualifier("slave02") DataSource slave02) {
        Map<Object, Object> targetDataSource = new HashMap<>();
        targetDataSource.put("master", master);
        targetDataSource.put("slave01", slave01);
        targetDataSource.put("slave02", slave02);
        DynamicRoutingDataSource dataSource = new DynamicRoutingDataSource();
        dataSource.setTargetDataSources(targetDataSource);
        return dataSource;
    }


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dynamicDataSource") DynamicRoutingDataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        sqlSessionFactory.setConfiguration(configuration);
        sqlSessionFactory.setPlugins(new DynamicDataSourceInterceptor(), new PageHelper());
        sqlSessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver()
                        .getResources("classpath*:Mapper/*.xml")
        );
        return sqlSessionFactory.getObject();
    }

    /**
     * 配置事务管理器
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager(@Qualifier("dynamicDataSource") DynamicRoutingDataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
