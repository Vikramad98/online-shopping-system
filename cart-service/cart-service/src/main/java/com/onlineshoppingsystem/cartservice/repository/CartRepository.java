package com.onlineshoppingsystem.cartservice.repository;

import com.onlineshoppingsystem.cartservice.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartItem,String> {
}
