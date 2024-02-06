package com.example.springboot.models;

import com.google.gson.Gson;

public class UserModel {
    private String username;
    private String email;
    private String password;

    public UserModel(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static UserModel fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, UserModel.class);
    }
}
