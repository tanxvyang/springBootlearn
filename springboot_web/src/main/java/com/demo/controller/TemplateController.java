package com.demo.controller;


import com.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class TemplateController {
    @RequestMapping("/test1")
    public String test1(Model model){
        System.out.println("进入success======================");
        model.addAttribute("name","alice");
        model.addAttribute("age","18");
        model.addAttribute("role","admin");
        User user = new User(1001,"tome",21);
        model.addAttribute("user",user);
        return "success";//自动添加前缀/templates和后缀.html// }
    }

    @RequestMapping("/test2")
   // @ResponseBody
    public String test2(Model model){
        User user = new User(1001,"tome3",21);
        model.addAttribute("user",user);
        return "result";//自动添加前缀/templates和后缀.html// }
    }
    @RequestMapping("/modify")
   // @ResponseBody
   public String modify(@ModelAttribute("user") User user){
        System.out.println("user============:"+user.toString());
        return "success";
    }

    @RequestMapping("/test3")
    // @ResponseBody
    public String test3(Model model){
        User user = new User(1001,"tome12",21);
        model.addAttribute("user",user);
        List<User> users = new ArrayList<>();
        users.add(new User(1002,"tome2",212));
        users.add(new User(1003,"tome24",212));
        users.add(new User(1004,"tome25",212));
        model.addAttribute("user",user);
        model.addAttribute("users",users);
        return "list";//自动添加前缀/templates和后缀.html// }
    }


    }
