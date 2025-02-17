package com.andres.springcloud.mscv.products.controllers;


import com.andres.springcloud.mscv.products.entities.Product;
import com.andres.springcloud.mscv.products.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.status(200).body(productService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> prductById(@PathVariable String id) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) return ResponseEntity.ok(productOptional.orElseThrow());
        return ResponseEntity.notFound().build();
    }
}
