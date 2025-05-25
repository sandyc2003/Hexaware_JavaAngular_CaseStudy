package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.Order;
import com.hexaware.hotpot.repositories.OrderRepository;

public class OrderServiceImpl implements IOrderService {
    @Autowired private OrderRepository repo;

	@Override
	public Order placeOrder(Order order) {
		return repo.save(order);
	}

	@Override
	public Order updateOrderStatus(int orderId, String orderStatus) {
		Order order = repo.findById(orderId).orElse(null);
        if (order != null) {
            order.setOrderStatus(orderStatus);
            return repo.save(order); 
        }
    return null;
	}

	@Override
	public Order getOrderById(int orderId) {
		return repo.findById(orderId).orElse(null);
	}

	@Override
	public List<Order> getOrdersByUserId(int userId) {
		return repo.findByUserUserId(userId);
	}

	@Override
	public List<Order> getOrdersByStatus(String orderStatus) {
		return repo.findByOrderStatus(orderStatus);
	}

	@Override
	public List<Order> getAllOrders() {
		return repo.findAll(); 
	}

}
