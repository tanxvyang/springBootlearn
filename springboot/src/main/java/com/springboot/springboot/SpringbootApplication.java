package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@CompomentScan("com.xxx.xx")//指定扫包，默认只扫描主程序类及其子包
//@ImportResource({"classpath:spring.xml"})//引入配置文件
public class SpringbootApplication {

    public static void main(String[] args) {
        //启动springboot应用，传入主程序类的class对象
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
