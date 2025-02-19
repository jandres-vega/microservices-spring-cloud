package com.andres.springcloud.mscv.items.services;

import com.andres.springcloud.mscv.items.models.ItemDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<ItemDTO> findAll();
    Optional<ItemDTO>findById(String id);
}
