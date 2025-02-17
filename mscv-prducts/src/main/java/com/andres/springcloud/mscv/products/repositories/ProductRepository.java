package com.andres.springcloud.mscv.products.repositories;


import com.andres.springcloud.mscv.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {}
