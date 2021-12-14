package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
public class TestController {
    @RequestMapping("hello")
  //  @ResponseBody
    public String hello(){
        return "hello world";
    }

@RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("status",200);
        map.put("message","success");
        map.put("data","hello world");
        return map;
    }

}
