package com.onlineshoppingsystem.productservice.controller;

import com.onlineshoppingsystem.productservice.entity.Product;
import com.onlineshoppingsystem.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/available")
    public List<Product> getAvailableProducts() {
        return productService.getAvailableProducts();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProductDetails(@PathVariable String productId) {
        return productService.getProductDetails(productId);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("/{productId}")
    public void removeProduct(@PathVariable String productId) {
        productService.removeProduct(productId);
    }
}

