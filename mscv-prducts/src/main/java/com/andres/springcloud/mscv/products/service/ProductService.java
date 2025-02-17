package com.andres.springcloud.mscv.products.service;



import com.andres.springcloud.mscv.products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(String id);
    Product save(Product product);
    void deleteById(String id);
}
