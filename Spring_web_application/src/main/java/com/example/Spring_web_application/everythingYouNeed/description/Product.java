package com.example.Spring_web_application.everythingYouNeed.description;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private Integer id;

  private String title;

  private String details;
}
