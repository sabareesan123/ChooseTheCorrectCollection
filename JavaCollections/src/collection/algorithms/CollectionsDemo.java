package collection.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
     public static void main(String args[]) {
      // create an array of string objs
      String [] numbersAsString = { "One", "Two", "Three", "One", "Two", "Three" };
      
      // create one list
      List<String> list = Arrays.asList(numbersAsString);
      
      System.out.println("List value before: " + list);
      
      // sort the list
      Collections.sort(list);
      
      System.out.println("List value after sort: " + list);
   }
}