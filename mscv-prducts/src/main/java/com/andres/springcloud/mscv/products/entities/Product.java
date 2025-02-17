package com.andres.springcloud.mscv.products.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name_product")
    private String nameProduct;

    private Double price;

    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
