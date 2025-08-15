package com.pluralsight.choosing_right_collection.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
@AllArgsConstructor
public class FoodDeliveryController {

    //    2. Food Delivery: Restaurant Menu

    @GetMapping
    public List<String> getMenuItems() {
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Paneer Butter Masala");
        menuItems.add("Veg Biryani");
        menuItems.add("Gulab Jamun");
        return menuItems;
    }


}
