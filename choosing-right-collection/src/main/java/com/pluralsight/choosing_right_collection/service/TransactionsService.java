package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionsService {


    public List<String> getRecentTransactions() {
        List<String> transactions = new ArrayList<>();
        transactions.add("Credited ₹5000");
        transactions.add("Debited ₹1200");
        transactions.add("Credited ₹300");
        return transactions;
    }
}
