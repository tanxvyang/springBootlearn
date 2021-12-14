package com.demo.config;

import com.demo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 1添加@Configuration注解
 * 2实现WebMvcConfigurer接口，
 * 3.根据需要实现相应方法
 * 接口中的方法都添加了jdk1.8中的defaut方法修饰，不强制实现所有方法（jdk1.8的新特性）
 */
@Configuration
public class CustomMvcConfig implements WebMvcConfigurer {
    //添加ViewControllers
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //访问/showLogin时跳转到login视图
       registry.addViewController("/showLogin").setViewName("login");
    }
    //添加interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册一个拦截器
      //registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("test2");
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
