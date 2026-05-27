package com.example.RestAPI.Service;

import com.example.RestAPI.Entity.Products;
import com.example.RestAPI.Repository.ProductsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductsRepo repo;

    public ProductService(ProductsRepo repo){
        this.repo=repo;
    }

    public List<Products> getProducts(){
        return repo.findAll();
    }
    public Products addProduct(Products product){
        return  repo.save(product);
    }
    public Products getProductById(int id){
        return repo.findById(id).get();
    }
    public Products updateProduct(Products product){
        return repo.save(product);
    }
    public void deleteProduct(int id){
        repo.deleteById(id);
    }
}
