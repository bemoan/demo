package com.xry.demo.controller;

import com.xry.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public  String index(){
        return "yes";
    }
//    @RequestMapping("/getUser")
//    public User getUser(){
//        User user=new User();
//        user.setName("金融办");
//        user.setPassword("123456");
//        return  user;
//    }
}