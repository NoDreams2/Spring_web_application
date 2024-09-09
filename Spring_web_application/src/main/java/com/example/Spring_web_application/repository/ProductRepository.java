package com.example.Spring_web_application.repository;

import com.example.Spring_web_application.everythingYouNeed.description.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
  List<Product> findAll();

  Product save(Product product);

  Optional<Product> findById(Integer productId);

  void deleteById(Integer id);
}
