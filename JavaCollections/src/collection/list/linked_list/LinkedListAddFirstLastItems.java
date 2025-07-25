package collection.list.linked_list;

import java.util.LinkedList;

public class LinkedListAddFirstLastItems 
{
    public static void main(String[] args)
    {
        LinkedList<String> grades = new LinkedList<>();
        grades.add("Child");
        grades.add("C");
        grades.add("D");
        grades.add("E");
 
        System.out.println("Original values are:");
        System.out.println("====================");
        for (String grade : grades) {
            System.out.println("Grade = " + grade);
        }
 
        grades.addFirst("Parent");
        grades.addLast("F");
 
        System.out.println("New values are:");
        System.out.println("====================");
        
        for (String grade : grades) {
            System.out.println("Grade = " + grade);
        }
    }
}