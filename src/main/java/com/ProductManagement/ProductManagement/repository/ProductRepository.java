package com.ProductManagement.ProductManagement.repository;

import com.ProductManagement.ProductManagement.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  ProductRepository extends MongoRepository<Product, String> {
}
