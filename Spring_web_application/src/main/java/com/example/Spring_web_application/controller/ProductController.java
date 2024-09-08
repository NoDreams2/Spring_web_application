package com.example.Spring_web_application.controller;

import com.example.Spring_web_application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue/products")
public class ProductController {

  private final ProductService productService;

  @GetMapping("list")
  public String getProductsList (Model model) {
    model.addAttribute("products", this.productService.findAllProducts());
    return "catalogue/products/list";
  }
}
