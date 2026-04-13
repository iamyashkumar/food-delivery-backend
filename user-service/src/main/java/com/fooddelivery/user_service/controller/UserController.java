package com.fooddelivery.user_service.controller;

import com.fooddelivery.user_service.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/users")
public class UserController{
    private List<User> userList = new ArrayList<>();
    @GetMapping("/all")
    public List<User> getAllUser() {
        userList.add(new User(1L, "Yash Kumar", "yash@gmail.com", "pass123"));
        userList.add(new User(2L, "Rahul Singh", "rahul@gmail.com", "pass456"));
        userList.add(new User(3L, "Priya Sharma", "priya@gmail.com", "pass789"));
        return userList;
    }
     @GetMapping("/{id}")
     public User getUserById(@PathVariable Long id) {
         for (User user : userList) {
             if (user.getId().equals(id)) {
                 return user;
             }
         }
         return null;
     }
         @PostMapping
         public String addUser(@RequestBody User user) {
             userList.add(user);
             return "User added successfully!";
         }
         }

