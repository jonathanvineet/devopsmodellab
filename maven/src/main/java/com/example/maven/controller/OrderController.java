package com.example.maven.controller;

import com.example.maven.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
    
    @PostMapping("/dashboard")
    public String order(@RequestParam String item, @RequestParam Integer count, Model model) {
        OrderController order = new OrderController(item, count);
        if (count != 0) {
            model.addAttribute("item", order.getItemname());
            model.addAttribute("count", order.getCount());
            return "orderconfirm";
        }
        return "dashboard";
    }
}

