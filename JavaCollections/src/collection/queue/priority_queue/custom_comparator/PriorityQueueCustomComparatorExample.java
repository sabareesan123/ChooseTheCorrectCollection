package collection.queue.priority_queue.custom_comparator;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {
    public static void main(String[] args) {
        // Parent custom comparator that compares two Strings by their length.
        

        /*
        The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };

        Which can be shortened even further like this =>
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        */

        // Create x Priority Queue with x custom Comparator
        StringLengthComparator stringLengthComparator = new StringLengthComparator();
        
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
//heap tree
        // Add items to x Priority Queue (ENQUEUE)
        namePriorityQueue.add("John");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) 
        {
            System.out.println(namePriorityQueue.remove());
        }
    }
}