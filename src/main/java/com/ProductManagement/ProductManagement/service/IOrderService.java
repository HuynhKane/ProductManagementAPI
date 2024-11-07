package com.ProductManagement.ProductManagement.service;

import com.ProductManagement.ProductManagement.model.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(String id);
    public Order addOrder(Order order);
    public Order updateOrder(String id, Order orderDetails);
    public void deleteOrder(String id);
    public List<Order> searchOrders(String query);
}
