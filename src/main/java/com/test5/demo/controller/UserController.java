package com.test5.demo.controller;

import com.test5.demo.entity.User;
import com.test5.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired

    private UserService userService;


    @RequestMapping("/abcd")
        public List<User> getUser(){
         return userService.findAll();
    }
}
