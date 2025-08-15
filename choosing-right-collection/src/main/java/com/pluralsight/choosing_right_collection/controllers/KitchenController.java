package com.pluralsight.choosing_right_collection.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

@RestController
@RequestMapping("/kitchen")
@AllArgsConstructor
public class KitchenController {

    //    5. Food Delivery: Kitchen Order    Queue

    @GetMapping("/next")
    public String getNextOrder() {
        Queue<String> kitchenQueue = new ArrayDeque<>();
        kitchenQueue.add("Order #101 - Dosa");
        kitchenQueue.add("Order #102 - Idli");
        kitchenQueue.add("Order #103 - Vada");
        return "Preparing: " + kitchenQueue.poll();
    }

}
