package collection.algorithms;

import java.util.Arrays;
 
public class CompareArrayExample {
    public static void main(String[] args) {
        String[] abc = {"oracle", "Java", "Dot", "com"};
        String[] xyz = {"oracle", "Java", "Dot", "com"};
        String[] java = {"Java", "Dot", "Com"};
 
        System.out.println(Arrays.equals(abc, xyz));
        System.out.println(Arrays.equals(abc, java));
    }
}