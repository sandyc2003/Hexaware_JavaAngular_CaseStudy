package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.OrderItem;

public interface IOrderItemService {
	 OrderItem addOrderItem(OrderItem item);
	    OrderItem getOrderItemById(int orderItemId);
	    List<OrderItem> getAllOrderItems();
}
