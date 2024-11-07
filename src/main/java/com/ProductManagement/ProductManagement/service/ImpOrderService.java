package com.ProductManagement.ProductManagement.service;


import com.ProductManagement.ProductManagement.model.Order;
import com.ProductManagement.ProductManagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpOrderService implements IOrderService{

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(String id, Order orderDetails) {
        Order order = getOrderById(id);
        if (order != null) {
            order.setCustomerName(orderDetails.getCustomerName());
            order.setOrderDate(orderDetails.getOrderDate());
            order.setTotalAmount(orderDetails.getTotalAmount());
            order.setStatus(orderDetails.getStatus());
            return orderRepository.save(order);
        }
        return null;
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    public List<Order> searchOrders(String query) {
        return orderRepository.findByCustomerNameContainingOrOrderIdContaining(query, query);
    }
}
