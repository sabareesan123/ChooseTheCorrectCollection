package collection.algorithms;
import java.util.Arrays;

public class ArraySortingDemo {

   public static void main(String[] args) {

    // initializing unsorted int array
    int [] intArray = {2, 1, 9, 6, 4};

    // let us print all the elements available in list
    for (int number : intArray)
    {
      System.out.println("Number = " + number);
    }

    // sorting array
    Arrays.sort(intArray);
    
    // let us print all the elements available in list
    System.out.println("The sorted int array is:");
    for (int number : intArray) 
    {
      System.out.println("Number = " + number);
    }
  }
}