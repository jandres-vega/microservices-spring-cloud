package com.andres.springcloud.mscv.items.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String idProduct;
    private String name;
    private Double price;
    private LocalDate createdAt;
}
