package com.xry.demo.controller;

import com.xry.demo.domain.User;
import com.xry.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/getUser")
    public List<User> getUser(){
       List<User> userlist=userMapper.getAll();
        return userlist;
    };
}