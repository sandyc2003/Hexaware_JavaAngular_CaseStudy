package com.hexaware.hotpot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    List<CartItem> findByUserUserId(int userId);
    void deleteByUserUserId(int userId);
}
