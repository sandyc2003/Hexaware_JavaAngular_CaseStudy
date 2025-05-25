package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.OrderItem;
import com.hexaware.hotpot.repositories.OrderItemRepository;

public class OrderItemServcieImpl implements IOrderItemService {
    @Autowired private OrderItemRepository repo;

    public OrderItem addOrderItem(OrderItem item) { return repo.save(item); }
    public OrderItem getOrderItemById(int orderItemId) { return repo.findById(orderItemId).orElse(null); }
    public List<OrderItem> getAllOrderItems() { return repo.findAll(); }

}
