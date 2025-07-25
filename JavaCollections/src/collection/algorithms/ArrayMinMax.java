package collection.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
 
public class ArrayMinMax {
	
	int returnFirst(int[] arr){
		return arr[5];
	}
    public static void main(String[] args) 
    {
        // Creates an array of integer numbers in it.
        int[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3 };
 
        Arrays.sort(numbers);

        // To get the minimum or maximum value from the array we can
        // use the Collections.min() and Collections.max() methods.
        // But as this method requires A list type of data we need
        // to convert the array to list first.
 		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
 		
        int min = Collections.min(list);
        int max =  Collections.max(list);
 
        // Viola! we get the minimum and the maximum value from the
        // array.
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}