package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.Order;

public interface IOrderService {
	 Order placeOrder(Order order);
	    Order updateOrderStatus(int orderId, String orderStatus);
	    Order getOrderById(int orderId);
	    List<Order> getOrdersByUserId(int userId);
	    List<Order> getOrdersByStatus(String orderStatus);
	    List<Order> getAllOrders();
}
