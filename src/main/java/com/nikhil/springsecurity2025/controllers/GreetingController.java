package com.nikhil.springsecurity2025.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Hello World! " + request.getSession().getId();
    }
}
