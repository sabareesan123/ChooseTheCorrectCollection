package collection.list.array_list;

import java.util.ArrayList;
import java.util.HashSet;

 
public class CollectionToArrayList 
{    
    public static void main(String[] args)
    {
        // We create LinkedList collection type at put some values
        // in it. Here we put Parent, Child, C and D letter into it.
        HashSet<String> set = new HashSet<>();
        set.add("Parent");
        set.add("Child");
        set.add("C");
        set.add("D");
         
        // Let say you want to convert it to other type of collection,
        // for instance here we convert it into ArrayList. To do it
        // we can pass the collection created above as x parameter to
        // ArrayList constructor.
        ArrayList<String> arrayList = new ArrayList<>(set);
        
         String[] array = (String[]) arrayList.toArray();
         
        // Now we have converted the collection into ArrayList and
        // printed what is inside.
         
        for (String string : arrayList)
        {
            System.out.println("s = " + string);            
        }
    }
}