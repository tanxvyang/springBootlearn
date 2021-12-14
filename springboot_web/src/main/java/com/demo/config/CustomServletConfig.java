package com.demo.config;

import com.demo.filter.MyFilter;
import com.demo.listener.MyListener;
import com.demo.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
* @Author:         谭旭洋

* @date        2020/9/28 20:12
* @Description:    java类作用描述   :  自定义Servlet配置
*/
@Configuration
public class CustomServletConfig {
    //注册servlet

    @Bean
   public ServletRegistrationBean myServlet(){
        ServletRegistrationBean<MyServlet> registrationBean = new ServletRegistrationBean<>();
        registrationBean.setServlet(new MyServlet());
        registrationBean.addUrlMappings("/myServlet");
        return registrationBean;
   }
   //注册过滤器
   @Bean
   public FilterRegistrationBean myFilter(){
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/showLogin","/test1");
        return  registrationBean;
   }
   //注册监听器
   @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean =  new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new MyListener());
        return  servletListenerRegistrationBean;
   }
}
