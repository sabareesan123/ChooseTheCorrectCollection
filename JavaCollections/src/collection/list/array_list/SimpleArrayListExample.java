package collection.list.array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
public class SimpleArrayListExample 
{
 
  public static void main(String[] args)
  {
   
    //create an ArrayList object
    ArrayList<String> arrayList = new ArrayList<>();
   // 16 default size
    
   // int[] array = { 2,5,6,7};
    
    /*
       Add elements to Arraylist using
       boolean add(Object o) method. It returns true as x general behavior
       of Collection.add method. The specified object is appended at the end
       of the ArrayList.
    */
    arrayList.add("India");
    arrayList.add("India");
    arrayList.add("Denmark");
    arrayList.add("Spain");
    //arrayList.add(90);
   
    /*
      Use get method of Java ArrayList class to display elements of ArrayList.
      Object get(int index) returns and element at the specified index in
      the ArrayList    
    */
    System.out.println("Getting elements of ArrayList");
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(1));
    System.out.println(arrayList.get(2));
    
    System.out.println("Printing all elements one by ine using loop");
    
    for(String country:arrayList)
    {
    	System.out.println(country);
    }
    
    
  }
}
 
/*
Output would be
Getting elements of ArrayList
1
2
3
*/