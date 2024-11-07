package com.ProductManagement.ProductManagement.controller;



import com.ProductManagement.ProductManagement.model.Order;
import com.ProductManagement.ProductManagement.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:3000") // For local frontend connection
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/")
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable String id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
    }

    @GetMapping("/search")
    public List<Order> searchOrders(@RequestParam String query) {
        return orderService.searchOrders(query);
    }
}
