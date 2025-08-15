package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;
import java.util.List;

@Service
public class CartService {

    //    7. E-commerce: Shopping Cart Operations

    public List<String> getCartItems() {
        LinkedList<String> cart = new LinkedList<>();
        cart.add("Shoes");
        cart.add("T-shirt");
        cart.add("Watch");
        cart.removeLast(); // Simulate user removing last item
        return cart;
    }
}
