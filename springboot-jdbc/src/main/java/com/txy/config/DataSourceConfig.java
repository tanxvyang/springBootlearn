package com.txy.config;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.security.PublicKey;

@Configuration
public class DataSourceConfig {
    @Bean
    //从配置文件中读取spring.datasource属性,并注入给数据源属性
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        // BasicDataSource basicDataSource = new BasicDataSource();
         return  new BasicDataSource();
    }
}
