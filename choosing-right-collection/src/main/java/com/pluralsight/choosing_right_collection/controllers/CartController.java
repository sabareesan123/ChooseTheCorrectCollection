package com.pluralsight.choosing_right_collection.controllers;

import com.pluralsight.choosing_right_collection.service.CartService;
import com.pluralsight.choosing_right_collection.service.Order;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


    @GetMapping
    public Set<Order> getCartItems() {

        return cartService.getCartItems();
    }

    @PostMapping
    public void  add(@RequestBody Order order)
    {
         cartService.addItem(order);
    }

    @PutMapping
    public void put(@RequestBody Order order)
    {
        cartService.modifyOrder(order);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        cartService.remove(id);
    }
}
