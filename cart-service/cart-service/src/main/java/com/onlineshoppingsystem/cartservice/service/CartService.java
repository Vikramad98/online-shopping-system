package com.onlineshoppingsystem.cartservice.service;

public interface CartService {
    void addToCart(String productId);

    void removeFromCart(String productId);

    void updateQuantity(String productId, int quantity);

    float calculateTotalCost();
}
