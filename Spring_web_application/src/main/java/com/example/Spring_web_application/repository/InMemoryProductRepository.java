package com.example.Spring_web_application.repository;

import com.example.Spring_web_application.everythingYouNeed.description.Product;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductRepository implements ProductRepository {

  private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

  @Override
  public List<Product> findAll() {
    return Collections.unmodifiableList(products);
  }

  @Override
  public Product save(Product product) {
    product.setId(this.products.stream()
            .max(Comparator.comparingInt(Product::getId))
            .map(Product::getId)
            .orElse(0) + 1);
    this.products.add(product);
    return product;
  }
}
