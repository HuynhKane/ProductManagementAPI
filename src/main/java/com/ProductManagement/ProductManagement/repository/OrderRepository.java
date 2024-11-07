package com.ProductManagement.ProductManagement.repository;



import com.ProductManagement.ProductManagement.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findByCustomerNameContainingOrOrderIdContaining(String customerName, String orderId);
}
