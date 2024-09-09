package com.example.Spring_web_application.controller;

import com.example.Spring_web_application.everythingYouNeed.description.Product;
import com.example.Spring_web_application.payload.UpdateProductPayload;
import com.example.Spring_web_application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue/products/{productId:\\d+}")
public class ProductsController {

  private final ProductService productService;

  @ModelAttribute("product")
  public Product product(@PathVariable("productId") int productId) {
    return this.productService.findProduct(productId).orElseThrow();
  }

  @GetMapping()
  public String getProduct() {
    return "catalogue/products/product";
  }

  @GetMapping("edit")
  public String getProductEditPage() {
    return "catalogue/products/edit";
  }

  @PostMapping("edit")
  public String updateProduct(@ModelAttribute("product") Product product, UpdateProductPayload payload) {
    this.productService.updateProduct(product.getId(), payload.title(), payload.details());
    return "redirect:/catalogue/products/%d".formatted(product.getId());
  }
}
