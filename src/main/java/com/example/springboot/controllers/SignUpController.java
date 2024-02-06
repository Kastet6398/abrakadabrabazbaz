package com.example.springboot.controllers;

import com.example.springboot.models.UserModel;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.http.HttpRequest;

public class SignUpController extends HttpServlet {
    private final UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String UserName = request.getParameter("signup-UserName");
        String email = request.getParameter("signup-email");
        String password = request.getParameter("signup-password");
        String confirmPassword = request.getParameter("confirm-password");



        if(password.equals(confirmPassword) && !UserName.equals("")){
        }

        UserModel user = new UserModel(UserName, email, password);
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath() + "/homePage");
    }
}
