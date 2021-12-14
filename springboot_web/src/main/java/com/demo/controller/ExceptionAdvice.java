package com.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常通知
 */
@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler( ArithmeticException.class)
    @ResponseBody
    public String arithmetic(Exception e){
        System.out.println("警报，程序出现异常，发短信："+e.getMessage());
        return "error/5xx";
    }
    @ExceptionHandler( Exception.class)
    @ResponseBody
    public String exception(Exception e){
        System.out.println("警报，程序出现异常，发邮件："+e.getMessage());
        return "error/5xx";
    }
}
