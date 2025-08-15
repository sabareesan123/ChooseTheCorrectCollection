package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {


    public List<String> getMenuItems() {
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Paneer Butter Masala");
        menuItems.add("Veg Biryani");
        menuItems.add("Gulab Jamun");
        return menuItems;
    }
}
