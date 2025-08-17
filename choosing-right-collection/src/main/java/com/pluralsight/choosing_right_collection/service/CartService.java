package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

//    E-commerce: Shopping Cart Operations

@Service
public class CartService
{

    Set<Order> cart = new LinkedHashSet<>();

    public Set<Order> getCartItems() {
        return cart;
    }

    public void addItem(Order order)
    {
        cart.add(order);
    }

    public void remove(int id)
    {
        Optional<Order> optionalOrder = cart.stream().filter(order2 -> order2.getId() == id  ).findAny();
        optionalOrder.ifPresent(order -> cart.remove(order));
    }

    public void modifyOrder(Order order)
    {
        Optional<Order> optionalOrder = cart.stream().filter(order2 -> order2.getId() == order.getId()  ).findAny();
        cart.remove(order);
        cart.add(order);
    }


}
