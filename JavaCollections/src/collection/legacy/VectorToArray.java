package collection.legacy;



import java.util.Vector;

public class VectorToArray {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // 
        // Declares and initializes an Integer array.
        //
        Integer[] numbers = new Integer[vector.size()];

        // 
        // Copies the components of this vector into the specified 
        // array of Integer
        //
        vector.copyInto(numbers);

        for (Integer number : numbers) {
            System.out.println("number: " + number);
        }
    }
}