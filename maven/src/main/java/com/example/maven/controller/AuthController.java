package com.example.maven.controller;

import com.example.maven.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @PostMapping("/login")
    public String login(
            @RequestParam(required = false, defaultValue = "") String username,
            @RequestParam(required = false, defaultValue = "") String password,
            Model model) {
        User user = new User(username, password);
        if (!user.getUsername().isBlank() && !user.getPassword().isBlank()) {
            model.addAttribute("username", user.getUsername());
            return "dashboard";
        }
        model.addAttribute("error", "Please enter both username and password.");
        return "login";
    }
    
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
    
    @PostMapping("/register")
    public String register(
            @RequestParam(required = false, defaultValue = "") String username,
            @RequestParam(required = false, defaultValue = "") String password,
            Model model) {
        User user = new User(username, password);
        if (user.getUsername().isBlank() || user.getPassword().isBlank()) {
            model.addAttribute("error", "Please enter both username and password.");
            return "register";
        }
        model.addAttribute("username", user.getUsername());
        return "success";
    }
}

