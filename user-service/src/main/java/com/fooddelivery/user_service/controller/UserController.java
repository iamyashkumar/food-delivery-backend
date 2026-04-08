package com.fooddelivery.user_service.controller;

import com.fooddelivery.user_service.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController{
    @GetMapping("/all")
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Yash Kumar", "yash@gamil.com", "pass123"));
        users.add(new User(2L, "Rahul Singh", "rahul@gmail.com", "pass456"));
        users.add(new User(3L, "Priya Sharma", "priya@gmail.com", "pass789"));
        return users;
    }
     @GetMapping("/{id}")
     public User getUserById(@PathVariable Long id) {
        List<User> users = new ArrayList<>();
         users.add(new User(1L, "Yash Kumar", "yash@gmail.com", "pass123"));
         users.add(new User(2L, "Rahul Singh", "rahul@gmail.com", "pass456"));
         users.add(new User(3L, "Priya Sharma", "priya@gmail.com", "pass789"));
         for (User user : users) {
             if (user.getId().equals(id)){
                 return user;
             }
         }
         return null;
     }
}