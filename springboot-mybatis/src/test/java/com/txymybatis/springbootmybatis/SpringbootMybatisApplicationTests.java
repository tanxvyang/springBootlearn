package com.txymybatis.springbootmybatis;

import com.txymybatis.pojo.User;
import com.txymybatis.service.UserService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
//        添加user
       /* for (int i = 0; i <100 ; i++) {
            String username = "username"+(i*100);
            String password = "password"+(i*10);
            int age = i*5;
            userService.insert(new User(username,password,age));
        }*/


//        userService.updateBatch(userService.selectAll());

        userService.updatetowparam(userService.selectAll());

    }

}
