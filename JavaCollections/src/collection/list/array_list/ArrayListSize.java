package collection.list.array_list;

import java.util.ArrayList;
import java.util.List;
 
public class ArrayListSize 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        
        
 
        // 
        // Get the number of elements in the list
        //
        int size = list.size();
        System.out.println("size before remove " + list);
        System.out.println("List size = " + size);
        list.remove(1);
        size = list.size();
        System.out.println("List size = " + size);
        System.out.println("size after remove " + list);
    }
}