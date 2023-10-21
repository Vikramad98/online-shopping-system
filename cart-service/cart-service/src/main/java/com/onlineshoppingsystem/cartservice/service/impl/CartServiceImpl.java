package com.onlineshoppingsystem.cartservice.service.impl;

import com.onlineshoppingsystem.cartservice.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl {

    @Autowired
    CartRepository cartRepository;
    public void addToCart(String productId) {
        // Implementation to add a product to the cart
    }

    public void removeFromCart(String productId) {
        // Implementation to remove a product from the cart
    }

    public void updateQuantity(String productId, int quantity) {
        // Implementation to update the quantity of a product in the cart
    }

    public float calculateTotalCost() {
        // Implementation to calculate the total cost of products in the cart
    }
}
