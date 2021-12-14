package com.springboot.springboot;

import com.springboot.springboot.bean.Address;
import com.springboot.springboot.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

@SpringBootTest
@ImportResource({"classpath:spring.xml"})
public class SpringbootApplicationTests {
@Autowired
public User user;
@Autowired
public Address address;
    @Test
  public  void contextLoads() {
        System.out.println(user);
    }

}
