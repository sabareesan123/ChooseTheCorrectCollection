package collection.queue;

import java.util.Deque;
import java.util.LinkedList;
 
public class RemoveDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("Parent");
        deque.add("Child");
        deque.add("C");
        deque.add("D");
        deque.add("E");
        deque.add("F");
 
        //
        // Removes and retrieves the head of this Deque
        //        
        deque.remove();      // Removes "Parent"
 
        // 
        // Removes the first occurrence of element from this Deque
        //
        deque.remove("F");   // Removes "F"
 
        // 
        // Retrieves and removes the first element of this deque
        //
        deque.removeFirst(); // Removes "Child"
         
        // 
        // Retrieves and removes the last element of this deque
        //
        deque.removeLast();  // Removes "E"
 
        for (String item : deque) {
            System.out.println("Item = " + item);
        }
    }
}