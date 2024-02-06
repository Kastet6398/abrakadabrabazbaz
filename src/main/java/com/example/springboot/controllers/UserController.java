package com.example.springboot.controllers;

import com.example.springboot.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signupPage(String username, String email, String password, Model model) {
        model.addAttribute("user", new UserModel(username, email, password));
        return "signupPage";
    }


    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") UserModel user) {
        userService.saveUser(user);
        return "redirect:/";
    }
    @PostMapping("/createUser")
    public String createUser(@RequestBody UserModel user) {
        UserModel newUser = new UserModel(user.getUsername(), user.getEmail(), user.getPassword());
        return "Пользователь успешно создан.";
    }

}
