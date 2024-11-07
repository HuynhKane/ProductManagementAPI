package com.ProductManagement.ProductManagement.controller;

import com.ProductManagement.ProductManagement.model.Product;
import com.ProductManagement.ProductManagement.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    IProductService iProductService;

    public  ProductController(IProductService iProductService){
        this.iProductService = iProductService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return iProductService.getAllProducts();
    }
    @GetMapping("/{id}/get")
    public Product getProductById(@PathVariable("id") String id){
        return iProductService.getProduct(id);
    }
    @PostMapping("/add")
    public String addNewProduct(@RequestBody Product product){
        iProductService.addProduct(product);
        return "Add new, ok";
    }
    @PutMapping("/{id}/update")
    public String updateProduct(@RequestBody Product product){
        iProductService.updateProduct(product);
        return "Update, ok";
    }
    @DeleteMapping("/{id}/delete")
    public String deleteProduct(@PathVariable("id") String id){
        iProductService.deleteProduct(id);
        return "delete, ok";
    }
}
