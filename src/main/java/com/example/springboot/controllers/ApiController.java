package com.example.springboot.controllers;

import com.example.springboot.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserService userService;
    @PostMapping("/createUser")
    public String createUser(@RequestBody UserModel user) {
        return "Created";
    }

}
