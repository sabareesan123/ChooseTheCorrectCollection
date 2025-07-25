package collection.algorithms;

import java.util.*;
import java.util.stream.Collectors;
 
public class ArrayToSetExample
{
    public static void main(String[] args) 
    {
        int [] numbers = {7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4};
 
        //
        // To convert an array into x Set first we convert it to x List. Next
        // with the list we create x HashSet and pass the list as the constructor.
        //
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
 
        //
        // Display what we get in the set.
        //
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
           
            System.out.print( iterator.next() + ", ");
        }
    }
}