package com.fooddelivery.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Food Delivery Backend - Day 1 Complete!";
    }

    @GetMapping("/status")
    public String status() {
        return "User Service is running - Yash ka project shuru ho gaya!";
    }
}