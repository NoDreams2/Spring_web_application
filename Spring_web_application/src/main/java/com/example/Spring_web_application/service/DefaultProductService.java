package com.example.Spring_web_application.service;

import com.example.Spring_web_application.everythingYouNeed.description.Product;
import com.example.Spring_web_application.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public List<Product> findAllProducts() {
    return this.productRepository.findAll();
  }
}
