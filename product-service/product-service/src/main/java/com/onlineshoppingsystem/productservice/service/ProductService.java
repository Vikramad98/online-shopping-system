package com.onlineshoppingsystem.productservice.service;

import com.onlineshoppingsystem.productservice.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


public interface ProductService {

    List<Product> getAvailableProducts();

    Optional<Product> getProductDetails(String productId);

    void addProduct(Product product);

    void removeProduct(String productId);
}
