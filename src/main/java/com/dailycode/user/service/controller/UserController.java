package com.dailycode.user.service.controller;

import com.dailycode.user.service.entity.User;
import com.dailycode.user.service.responseobject.RestTemplateOject;
import com.dailycode.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public RestTemplateOject getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
}
