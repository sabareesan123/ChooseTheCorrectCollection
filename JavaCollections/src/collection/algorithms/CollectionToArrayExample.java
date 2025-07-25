package collection.algorithms;

import java.util.List;
import java.util.ArrayList;
 
public class CollectionToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kode");
        list.add("Java");
        list.add("Sample");
        list.add("Code");
 
        String[] array = (String[]) list.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}