package com.hexaware.hotpot.restcontrollers;

import com.hexaware.hotpot.dto.OrderDTO;
import com.hexaware.hotpot.services.IOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private IOrderService service;

    // ✅ POST: /api/orders/placeorder
    @PostMapping("/placeorder")
    public ResponseEntity<OrderDTO> placeOrder(@RequestBody OrderDTO dto) {
        return ResponseEntity.ok(service.placeOrder(dto));
    }

    // ✅ PUT: /api/orders/update-status/{id}?status=Delivered
    @PutMapping("/update-status/{id}")
    public ResponseEntity<OrderDTO> updateStatus(@PathVariable int id, @RequestParam String status) {
        return ResponseEntity.ok(service.updateOrderStatus(id, status));
    }

    // ✅ GET: /api/orders/getorder/{id}
    @GetMapping("/getorder/{id}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable int id) {
        return ResponseEntity.ok(service.getOrderById(id));
    }

    // ✅ GET: /api/orders/all
    @GetMapping("/all")
    public ResponseEntity<List<OrderDTO>> getAllOrders() {
        return ResponseEntity.ok(service.getAllOrders());
    }

    // ✅ GET: /api/orders/by-user/{userId}
    @GetMapping("/by-user/{userId}")
    public ResponseEntity<List<OrderDTO>> getOrdersByUser(@PathVariable int userId) {
        return ResponseEntity.ok(service.getOrdersByUserId(userId));
    }

    // ✅ GET: /api/orders/by-status/{status}
    @GetMapping("/by-status/{status}")
    public ResponseEntity<List<OrderDTO>> getOrdersByStatus(@PathVariable String status) {
        return ResponseEntity.ok(service.getOrdersByStatus(status));
    }
}
