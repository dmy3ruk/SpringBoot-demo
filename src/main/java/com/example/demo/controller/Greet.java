package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greet {
    @GetMapping("greet")
    public String greet(Model model) {
        model.addAttribute("message", "Ласкаво просимо до Spring Boot!");
        return "greetings"; // Ось тут повертається ім'я шаблону
    }
}
