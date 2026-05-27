package com.example.RestAPI.Controller;

import com.example.RestAPI.Entity.Products;
import com.example.RestAPI.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private ProductService service;

    public HomeController(ProductService service){
        this.service=service;
    }
    @GetMapping("products")
    public List<Products> getProducts(){
        return service.getProducts();
    }
    @PostMapping("products")
    public Products addProduct(@RequestBody Products product){
          return  service.addProduct(product);
    }
    @GetMapping("products/{id}")
    public Products getProductBYId(@PathVariable int id){
            return service.getProductById(id);
    }
    @PutMapping("products")
    public Products updateProduct(@RequestBody Products product){
           return service.updateProduct(product);

    }
    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }


}
