package com.hexaware.hotpot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotpot.entities.OrderItem;
import com.hexaware.hotpot.services.IOrderItemService;

@RestController
@RequestMapping("/api/orderitems")
public class OrderItemController {

    @Autowired
    private IOrderItemService service;

    @PostMapping("/add")
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        return service.addOrderItem(orderItem);
    }

    

    @GetMapping("/getbyid/{id}")
    public OrderItem getOrderItemById(@PathVariable int id) {
        return service.getOrderItemById(id);
    }

    @GetMapping("/getall/all")
    public List<OrderItem> getAllOrderItems() {
        return service.getAllOrderItems();
    }

   
}