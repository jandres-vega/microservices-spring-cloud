package com.andres.springcloud.mscv.items.clients;

import com.andres.springcloud.mscv.items.models.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "mscv-prducts")
public interface ProductFeignClient {

    @GetMapping("/api/v1/products")
    List<ProductDTO>findAll();

    @GetMapping("/api/v1/products/{id}")
    ProductDTO findById(@PathVariable String id);
}
