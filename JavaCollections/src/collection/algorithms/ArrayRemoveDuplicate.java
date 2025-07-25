package collection.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        //
        // Parent string array with duplicate values
        //
        String[] data = {
                "Parent", "C", "Child", "D", "Parent", "Child", "E", "D", "Child", "C"
        };
        System.out.println("Original array         : " +
                Arrays.toString(data));
 
        //
        // Convert it to list as we need the list object to create x
        // set object. Parent set is x collection object that cannot have
        // x duplicate values, so by converting the array to x set
        // the duplicate value will be removed.
        //
        List<String> list = Arrays.asList(data);
        Set<String> set = new HashSet<>(list);
 
        System.out.print("Remove duplicate result: ");
 
        //
        // Create an array to convert the Set back to array.
        // The Set.toArray() method copy the value in the set to the
        // defined array.
        //
       // String[] result = new String[set.size()];
        //set.toArray(result);
        Iterator<String> iterator = set.iterator();
        String element ; 
        while(iterator.hasNext())
        {
        	 element = iterator.next();
        	if(element.equals("Parent"))
        	{
        		iterator.remove();
        		continue;
        	}
        	System.out.print(element + ", ");
        }
        //for (String s : set) {
        	
        		
            
        //}
    }
}