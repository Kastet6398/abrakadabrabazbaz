package com.example.springboot.controllers;

import com.example.springboot.models.UserModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static final String USERS_JSON_FILE = "SignUp.json";

    public List<UserModel> getUsers() {
        List<UserModel> users = new ArrayList<>();
        try (Reader reader = new FileReader(USERS_JSON_FILE)) {
            Gson gson = new Gson();
            Type userListType = new TypeToken<ArrayList<UserModel>>(){}.getType();
            users = gson.fromJson(reader, userListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void saveUser(UserModel user) {
        List<UserModel> users = getUsers();
        users.add(user);
        saveUsers(users);
    }

    private void saveUsers(List<UserModel> users) {
        try (Writer writer = new FileWriter(USERS_JSON_FILE)) {
            Gson gson = new Gson();
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
