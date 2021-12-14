package com.xytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Author:         谭旭洋

* @date        2020/9/28 23:14
* @Description:    java类作用描述
*/
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("com.xytest.controller.HelloController.hello");
        model.addAttribute("name","alice");
        return "success";
    }
}
