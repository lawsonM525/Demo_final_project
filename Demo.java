import java.util.Deque;
import java.util.ArrayDeque;

public class Demo{

  public static void main(String[] args){

    // Create a new ArrayDeque to implement a stack
    System.out.println("Creating a new array deque...");
    System.out.println(" ");
    System.out.println("THIS SHOWS HOW A DEQUE CAN BE USED LIKE A STACK");
    Deque<Integer> stack = new ArrayDeque<Integer>();

    // demo addition methods at the head of the deque
    System.out.println("Adding 1 to the beginning deque...");
    stack.addFirst(1);
    System.out.println("Adding 2 to the beginning deque...");
    stack.addFirst(2);
    System.out.println("Adding 3 to the beginning deque...");
    stack.addFirst(3);
    System.out.println("Adding 4 to the beginning deque...");
    stack.addFirst(4);
    System.out.println("Adding 5 to the beginning deque...");
    stack.addFirst(5);
    System.out.println("Current Deque: " + stack);

    // demo removal methods at the head of the deque
    System.out.println("Removing the first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);

    // demo peeking at the head of the deque
    System.out.println("Peeking at the first element in the deque...");
    System.out.println("First element: " + stack.peekFirst());
    System.out.println("Current Deque: " + stack);
    System.out.println ("Peeking at the last element in the deque... because this is not a stack, it's a deque");
    System.out.println("Last element: " + stack.peekLast());
    System.out.println("Current Deque: " + stack);







  }

}
