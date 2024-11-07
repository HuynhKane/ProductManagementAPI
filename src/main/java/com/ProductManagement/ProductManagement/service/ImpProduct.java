package com.ProductManagement.ProductManagement.service;

import com.ProductManagement.ProductManagement.model.Product;
import com.ProductManagement.ProductManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProduct implements IProductService{

    @Autowired
    ProductRepository productRepository;

    public ImpProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public String addProduct(Product product) {
        productRepository.save(product);
        return "Add, ok";
    }

    @Override
    public String updateProduct(Product updatedProduct) {
        productRepository.save(updatedProduct);
        return "Update, ok";
    }

    @Override
    public String deleteProduct(String id) {
        productRepository.deleteById(id);
        return "delete, ok";
    }

    @Override
    public Product getProduct(String id) {
        if (productRepository.findById(id).isEmpty())
            return null;
        return  productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
