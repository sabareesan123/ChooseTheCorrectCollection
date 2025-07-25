package collection.deque_as_stack;
import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {

        // Create ArrayDeque with three elements.
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(500);
        stack.push(1000);

        // Peek to get the top item, but do not remove it.
        int peekResult = stack.peek();
        System.out.println(peekResult);

        // Call pop on the Deque.
        int popResult = stack.pop();
        System.out.println(popResult);

        // Pop again.
        popResult = stack.pop();
        System.out.println(popResult);
    }
}
