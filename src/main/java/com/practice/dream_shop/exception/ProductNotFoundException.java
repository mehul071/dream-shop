package com.practice.dream_shop.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);

    }
}
