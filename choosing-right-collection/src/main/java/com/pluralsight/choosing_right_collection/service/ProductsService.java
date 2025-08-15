package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {



    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        return products;
    }

}
