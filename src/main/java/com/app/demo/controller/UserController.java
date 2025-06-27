package com.app.demo.controller;

import com.app.demo.pojo.dto.UserDto;
import com.app.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // localhost:8080/users
public class UserController {

    @Autowired
    IUserService userService;

    // Add User
    @PostMapping
    public String add(@RequestBody UserDto user){
        userService.add(user);
        return "success";
    }

    // Search User

    // Update User

    // Delete User
}
