package com.andres.springcloud.mscv.products.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Transient
    private Integer port;

    @Column(name = "name_product")
    private String nameProduct;

    private Double price;

    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
