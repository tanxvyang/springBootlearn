package com.txymybatis.controller;

import com.github.pagehelper.PageInfo;
import com.txymybatis.pojo.User;
import com.txymybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){

        return userService.selectAll();
    }
    @RequestMapping("/findById")
    public User findById(int id){

        return userService.selectById(id);
    }
    @RequestMapping("/add")
    public User add(User user){
        userService.insert(user);
    return user;
    }

    @RequestMapping("/findByPage")
    public PageInfo findByPage(int pageNum){
       return userService.findByPage(pageNum,3);

    }

}
