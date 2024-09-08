package com.example.Spring_web_application.service;

import com.example.Spring_web_application.everythingYouNeed.description.Product;

import java.util.List;

public interface ProductService {
  List<Product> findAllProducts();
}
