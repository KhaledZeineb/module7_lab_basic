package com.example.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.orderservice.model.User;

@FeignClient(name = "user-service")
public interface UserService {
    @GetMapping("/users/{id}")
    User getUser(@PathVariable("id") Long id);
}
