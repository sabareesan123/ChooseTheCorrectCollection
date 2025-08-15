package com.pluralsight.choosing_right_collection.controllers;

import com.pluralsight.choosing_right_collection.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {


    private ProductsService productsService;


//1. E-commerce: Product Listing

    @GetMapping
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        return products;
    }

}

