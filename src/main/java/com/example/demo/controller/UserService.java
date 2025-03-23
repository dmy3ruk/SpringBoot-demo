package com.example.demo.controller;
import com.example.demo.service.ServiceU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserService {

    private final ServiceU usrService;

    public UserService(ServiceU usrService) {
        this.usrService = usrService;
    }


    // Запит для відображення користувачів
    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", usrService.getUsers());
        return "user-list"; // Ім'я шаблону для відображення
    }
}