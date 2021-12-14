package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
    @RequestMapping("/test1")
        public String  test1(int num){
        int i = 5 / num;
        return "success";
    }
    @RequestMapping("/test2")
    public String  test1(){
        String str = null;
        str.toString();
        return "success";
    }
}
