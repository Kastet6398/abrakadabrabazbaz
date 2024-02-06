package com.example.springboot.models;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class UserModel {
    private String username;
    private String email;
    private String password;

    public UserModel(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

        UserModel user = this;
        Gson gson = new Gson();
        String json = gson.toJson(user);

        try {
            FileWriter writer = new FileWriter("user.json");
            writer.write(json);
            writer.close();
            System.out.println("JSON файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании JSON файла.");
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
