package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.*;
import com.example.orderservice.model.User;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long, User> userMap = new HashMap<>();

    @PostConstruct
    public void setupUsers() {
        User u1 = new User(1L, "John Doe", "john@example.com");
        User u2 = new User(2L, "Jane Smith", "jane@example.com");
        userMap.put(u1.getId(), u1);
        userMap.put(u2.getId(), u2);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userMap.get(id);
    }
}
