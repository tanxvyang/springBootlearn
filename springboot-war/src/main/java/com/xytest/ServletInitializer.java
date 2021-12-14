package com.xytest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
/**
* @Author:         谭旭洋

* @date        2020/9/28 22:47
* @Description:    java类作用描述
 * 要求：
 * 1。继承SpringBootServletInitializer类
 * 2.重写configure方法
 * 3.调用SpringApplicationBuilder的sources()方法,传入SpringBoot应用的主程序类(SpringbootWarApplication.class)
*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootWarApplication.class);
    }

}
