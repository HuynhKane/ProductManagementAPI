package com.ProductManagement.ProductManagement.service;

import com.ProductManagement.ProductManagement.model.Product;

import java.util.List;

public interface IProductService {
    public String addProduct(Product product);
    public String updateProduct(Product updatedProduct);
    public String deleteProduct(String id);
    public Product getProduct(String id);
    public List<Product> getAllProducts();
}
