package com.andres.springcloud.mscv.items.services;

import com.andres.springcloud.mscv.items.clients.ProductFeignClient;
import com.andres.springcloud.mscv.items.models.ItemDTO;
import com.andres.springcloud.mscv.items.models.ProductDTO;
import feign.FeignException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ItemServiceFeign implements ItemService {

    private final ProductFeignClient productFeignClient;

    public ItemServiceFeign(ProductFeignClient productFeignClient) {
        this.productFeignClient = productFeignClient;
    }

    @Override
    public List<ItemDTO> findAll() {
        return productFeignClient.findAll().stream().map(p -> {
            Random random = new Random();
            return new ItemDTO(p, random.nextInt(10) + 1);
        }).toList();
    }

    @Override
    public Optional<ItemDTO> findById(String id) {
        try {
            ProductDTO product = productFeignClient.findById(id);
            Random random = new Random();
            return Optional.of(new ItemDTO(product, random.nextInt(10) + 1));
        } catch (FeignException e) {
            return Optional.empty();
        }
    }
}
