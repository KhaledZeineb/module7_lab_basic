package com.example.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.orderservice.model.Product;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductService {
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable("id") Long id);

    @GetMapping("/products/category/{category}")
    List<Product> getProductsByCategory(@PathVariable("category") String category);
}
