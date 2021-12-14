package com.txy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
 @RequestMapping("/user")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> strings =  jdbcTemplate.queryForList("select *from t_user ");
        System.out.println(strings);
        return strings;
    }

}
