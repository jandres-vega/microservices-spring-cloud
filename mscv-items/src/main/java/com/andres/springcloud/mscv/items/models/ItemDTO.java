package com.andres.springcloud.mscv.items.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private ProductDTO product;
    private int quantity;

    public Double getTotal() {
        return product.getPrice() * quantity;
    }
}
