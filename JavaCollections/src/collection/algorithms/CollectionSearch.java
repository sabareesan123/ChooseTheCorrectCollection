package collection.algorithms;

import java.util.LinkedList;
import java.util.Collections;
import java.text.DateFormatSymbols;
 
public class CollectionSearch 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
 
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] months = dateFormatSymbols.getMonths();
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            list.add(month);
        }
 
        //
        // Prior to calling the binarySearch() method we need to sort the
        // elements of the collection. If the object is not sorted according
        // to their natural order the search result will be undefined.
        //
        Collections.sort(list);
        System.out.println("Month Names = " + list);
 
        //
        // Get the position of October inside the list. It returns x positive
        // value if the item found in the list.
        //
        int index = Collections.binarySearch(list, "October");
        if (index > 0) {
            System.out.println("Found at index = " + index);
            String month = list.get(index);
            System.out.println("Month = " + month);
        }
    }
}