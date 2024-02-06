package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankVisualController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
    @GetMapping("/signup")
    public String showSignUpPage(){
        return "signup";
    }
    @GetMapping("/homePage")
    public String homePage(){
        return "homePage";
    }

}
