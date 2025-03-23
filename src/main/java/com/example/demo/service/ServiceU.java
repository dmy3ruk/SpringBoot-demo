package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.User;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceU {

    private List<User> users = new ArrayList<>();

    // Constructor with users passed in
    public ServiceU(List<User> users) {
        this.users = users;
    }

    // Method to add a user
    public void addUser(User user) {
        users.add(user);
    }

    // Method to get all users
    public List<User> getUsers() {
        return users;
    }

    // Default constructor with test data
    public ServiceU() {
        users.add(new User(1L, "Alina Dmytruk", "alina@google.com"));
        users.add(new User(2L, "Sasha Urkova", "sasha@google.com"));
        users.add(new User(3L, "Anastasia Feniak", "nastia@google.com"));
    }
}
