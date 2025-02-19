package com.andres.springcloud.mscv.products.service;

import com.andres.springcloud.mscv.products.entities.Product;
import com.andres.springcloud.mscv.products.repositories.ProductRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final Environment environment;

    public ProductServiceImpl(ProductRepository productRepository, Environment environment) {
        this.productRepository = productRepository;
        this.environment = environment;
    }

    @Override
    public List<Product> findAll() {
        return ((List<Product>) productRepository.findAll()).stream().peek(
                product ->
                        product.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port")))))
                .toList();
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
