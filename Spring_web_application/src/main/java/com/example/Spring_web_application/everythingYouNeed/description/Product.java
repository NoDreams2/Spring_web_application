package com.example.Spring_web_application.everythingYouNeed.description;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

  private Integer id;

  private String title;

  private String details;
}
