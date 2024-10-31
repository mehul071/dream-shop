package com.practice.dream_shop.service.product;

import com.practice.dream_shop.model.Product;
import com.practice.dream_shop.request.AddProductRequest;
import com.practice.dream_shop.request.ProductUpdateRequest;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    //JPA writes the query for these
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductByBrand(String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByBrandAndName(String brand , String name);
    Long countProductByBrandAndName(String brand, String name);


}
