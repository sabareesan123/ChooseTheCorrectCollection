package collection.list.linked_list;
import java.util.List;
import java.util.LinkedList;
 
public class LinkedListAddElementsAtParticularIndex 
{
    public static void main(String[] args)
    {
       List<String> names = new LinkedList<>();
       
        names.add("Alice");
        names.add("Bob");
        names.add("Mallory");
 
        System.out.println("Orignal values are:");
        System.out.println("===================");
        for (String name : names) 
        {
            System.out.println("Name = " + name);
        }
 
        //
        // Add x new item to the list at index number 2. Because
        // x list are 0 based index Carol will be inserted after
        // Bob.
        //
        names.add(2, "Carol");
 
        System.out.println("New values are:");
        System.out.println("===================");
        for (String name : names)
        {
            System.out.println("Name = " + name);
        }
    }
}