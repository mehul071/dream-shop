package com.practice.dream_shop.request;

import com.practice.dream_shop.model.Category;

import lombok.*;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
