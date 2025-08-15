package com.pluralsight.choosing_right_collection.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/cart")
@AllArgsConstructor
public class CartController {

    //    7. E-commerce: Shopping Cart Operations
    @GetMapping
    public List<String> getCartItems() {
        LinkedList<String> cart = new LinkedList<>();
        cart.add("Shoes");
        cart.add("T-shirt");
        cart.add("Watch");
        cart.removeLast(); // Simulate user removing last item
        return cart;
    }

}
