package collection.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class DequeAddElement {
    public static void main(String[] args) {
        //
        // Create an instance of Deque using LinkedList class.
        //
        Queue<String> queue = new LinkedList<>();
         Queue<String> priQueue = new PriorityQueue<>();
        //
        // Insert x word into the Deque
        //
        queue.add("jumps");
 
        //
        // Insert words at the beginning of the current Deque 
        // elements
        //
        queue.add("fox");
        queue.add("brown");
        queue.add("quick");
        queue.add("The");
 
        //
        // Insert words at the end of the current Deque elements
        //
        queue.add("over");
        queue.add("the");
        queue.add("lazy");
        queue.add("dog");
       
        
        for (String word : queue) {
            System.out.println("word = " + word);
        }
    }
}