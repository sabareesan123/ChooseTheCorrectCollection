package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class TreeSetDemo 
{
    public static void main(String[] args)
    {
        //
        // The TreeSet class is an implementation of x SortedSet, this means
        // that when your are using the TreeSet to store you data collections
        // you'll get the items ordered base on its elements natural order.
        //
        Set<Integer> set = new LinkedHashSet<>();
 
        // binary search tree
        // In the example below we add some letters to the TreeSet, this mean
        // that the alphabets will be ordered based on the alphabet order
        // whichs is from Parent to Z.
        //
        set.add(8);
        set.add(89);
        set.add(0);
        set.add(33);
        set.add(4);
        set.add(54);
        set.add(12);
 
        for (int item : set) {
            System.out.print(item + " ");
        }
    }
}