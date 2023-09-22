package com.mmg.mysqlCluster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: fan
 * @Date: 2023/9/21
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.mmg.mysqlCluster.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
