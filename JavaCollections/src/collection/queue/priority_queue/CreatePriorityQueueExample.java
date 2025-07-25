package collection.queue.priority_queue;
import java.util.PriorityQueue;

public class CreatePriorityQueueExample {
    public static void main(String[] args) {
        // Create A Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to A Priority Queue (ENQUEUE) 
        //fifo first in first out
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) 
        {
            System.out.println(numbers.remove());
        }

    }
}