package com.hexaware.hotpot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUserUserId(int userId);
    List<Order> findByOrderStatus(String status);
}
