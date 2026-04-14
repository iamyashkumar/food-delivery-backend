package com.fooddelivery.user_service.controller;

import com.fooddelivery.user_service.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/api/users")
public class UserController{
    private List<User> userList = new ArrayList<>();
    @GetMapping("/all")
    public List<User> getAllUser() {
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
         @DeleteMapping("/{id}")
         public String deleteUser(@PathVariable Long id) {
             userList.removeIf(user -> user.getId().equals(id));
             return "User deleted successfully!";
         }
     }

