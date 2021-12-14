package com.springboot.springboot.config;

import com.springboot.springboot.bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//标注在类上，表示是一个配置类，相当于以前的spring配置文件
public class SpringConfig {

    @Bean //标注在方法上，向容器中添加一个组件，将方法的返回值添加到容器中，方法名作为组件id
    public Address address(){
        Address address = new Address();
        address.setProvince("陕西");
        address.setCity("宝鸡");
        return  address;
    }
}
