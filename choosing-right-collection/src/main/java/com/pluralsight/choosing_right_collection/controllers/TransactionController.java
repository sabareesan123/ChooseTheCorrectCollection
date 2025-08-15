package com.pluralsight.choosing_right_collection.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RestController
@AllArgsConstructor
public class TransactionController {

    
    boolean anagram(String str1, String str2)
    {
        
        boolean result = false;
        
        char[] array = str1.toCharArray();
        for( int i = 0; i< array.length; i++)
      
        {
            array[i] = array[ i +1 ];
            array [ i + 1 ] = array[ i];
        }
        if( str2.equalsIgnoreCase(str1))
            result =  true;

        return result;
    }

//    6. Banking: Transaction Processing Queue

    @GetMapping("/process/transactions")
    public List<String> processTransactions() {
        Queue<String> processingQueue = new LinkedList<>();
        processingQueue.add("Transfer ₹1000 to A");
        processingQueue.add("Withdraw ₹500");
        processingQueue.add("Deposit ₹2000");

        List<String> processed = new ArrayList<>();
        while (!processingQueue.isEmpty()) {
            processed.add("Processed: " + processingQueue.poll());
        }
        return processed;
    }

    // 4. Banking: Recent Transactions (Display Only)

    @GetMapping("/transactions")
    public List<String> getRecentTransactions() {
        List<String> transactions = new ArrayList<>();
        transactions.add("Credited ₹5000");
        transactions.add("Debited ₹1200");
        transactions.add("Credited ₹300");
        return transactions;
    }


}
