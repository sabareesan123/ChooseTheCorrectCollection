package com.pluralsight.choosing_right_collection.service;


import lombok.Data;

@Data
public class Order {

    int id;
    Product product;
    int quantity;

}
