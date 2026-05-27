package com.example.RestAPI.Repository;

import com.example.RestAPI.Entity.Products;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products,Integer> {


}
