package com.example.Spring_web_application.repository;

import com.example.Spring_web_application.everythingYouNeed.description.Product;

import java.util.List;

public interface ProductRepository {
  List<Product> findAll();

  Product save(Product product);
}
