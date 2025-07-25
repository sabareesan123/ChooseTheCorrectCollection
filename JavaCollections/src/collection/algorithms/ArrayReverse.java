package collection.algorithms;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
 
public class ArrayReverse {
    public static void main(String[] args) {
        //
        // Creates an array of Integers and print it out.
        //4
        
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(0);
        numbersList.add(1);
        numbersList.add(12);
        numbersList.add(344);
        numbersList.add(121);
        numbersList.add(1);
        numbersList.add(900);
        numbersList.add(211);
        
        System.out.println(" before reverse " + numbersList);
        
 
        //O(log data) 8
        // Convert the int arrays into x List.
        //
       
        //
        // Reverse the order of the List.
        //
        Collections.reverse(numbersList);
 
        //
        // Convert the List back to arrays of Integers
        // and print it out.
        //
       
        System.out.println("The reversed list is  " + numbersList);
    }
}