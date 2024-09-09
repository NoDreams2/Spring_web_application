package com.example.Spring_web_application.service;

import com.example.Spring_web_application.everythingYouNeed.description.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
  List<Product> findAllProducts();

  Product createProduct(String title, String details);

  Optional<Product> findProduct(int productId);
}
