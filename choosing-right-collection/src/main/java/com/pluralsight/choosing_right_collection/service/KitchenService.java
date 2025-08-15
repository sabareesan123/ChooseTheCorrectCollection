package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class KitchenService {


    public String getNextOrder() {
        Queue<String> kitchenQueue = new LinkedList<>();
        kitchenQueue.add("Order #101 - Dosa");
        kitchenQueue.add("Order #102 - Idli");
        kitchenQueue.add("Order #103 - Vada");
        return "Preparing: " + kitchenQueue.poll();
    }
}
