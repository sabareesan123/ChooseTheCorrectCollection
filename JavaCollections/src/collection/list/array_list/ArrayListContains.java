package collection.list.array_list;
import java.util.ArrayList;
import java.util.List;
 
public class ArrayListContains
{
    public static void main(String[] args)
    {
    	//int[]  array = new int[10];
        List<Integer> list = new ArrayList<>(); //16
        list.add(1);
        list.add(20);
        list.add(390);
        list.add(33);
 
        //
        // Check to see if the list contains the "Item 1" 
        // string in it.
        //
        System.out.println("Printing allemenets" + list);
        System.out.println("Is the list contains :"+ -900);
        if (list.contains(-900)) 
            System.out.println("Yes");
         else
         {
            System.out.println("No");
        }
    }
}