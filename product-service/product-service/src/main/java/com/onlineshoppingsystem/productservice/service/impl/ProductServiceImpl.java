package com.onlineshoppingsystem.productservice.service.impl;

import com.onlineshoppingsystem.productservice.entity.Product;
import com.onlineshoppingsystem.productservice.repository.ProductRepository;
import com.onlineshoppingsystem.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAvailableProducts() {
        // Implementation to retrieve available products
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductDetails(String productId) {
        // Implementation to get product details
        return productRepository.findById(productId);
    }

    @Override
    public void addProduct(Product product) {
        // Implementation to add a new product
        productRepository.save(product);
    }

    @Override
    public void removeProduct(String productId) {
        // Implementation to remove a product
        productRepository.deleteById(productId);
    }
}
