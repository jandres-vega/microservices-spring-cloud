package com.andres.springcloud.mscv.items.controllers;

import com.andres.springcloud.mscv.items.models.ItemDTO;
import com.andres.springcloud.mscv.items.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<ItemDTO> getAllItems() {
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getItemById(@PathVariable String id) {
        Optional<ItemDTO> itenOptional = itemService.findById(id);
        if (itenOptional.isPresent()) return ResponseEntity.ok(itenOptional.orElseThrow());
        return ResponseEntity.status(404).build();
    }
}
