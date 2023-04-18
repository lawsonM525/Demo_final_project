import java.util.Deque;
import java.util.ArrayDeque;

public class Demo{

  public static void main(String[] args){
    System.out.println(" ======== PROGRAM STARTED ======== ");
    System.out.println(" ");
    System.out.println("This program demonstrates the use of the Deque interface");
    System.out.println(" ");

    // Create a new ArrayDeque to implement a stack
    System.out.println("Creating a new array deque...");
    System.out.println(" ");
    System.out.println("THIS SECTION SHOWS HOW A DEQUE CAN BE USED LIKE A STACK");
    System.out.println(" ");
    Deque<Integer> stack = new ArrayDeque<Integer>();

    // demo addition methods at the head of the deque
    System.out.println("Adding 1 to the beginning of the deque...");
    stack.addFirst(1);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 2 to the beginning of the deque...");
    stack.addFirst(2);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 3 to the beginning of the deque...");
    stack.addFirst(3);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 4 to the beginning of the deque...");
    stack.addFirst(4);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 5 to the beginning of the deque...");
    stack.addFirst(5);
    System.out.println("Current Deque: " + stack);
    System.out.println("");

    // demo removal methods at the head of the deque
    System.out.println("Removing the first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println(" ");

    // demo peeking at the head of the deque
    System.out.println("Peeking at the first element in the deque...");
    System.out.println("First element: " + stack.peekFirst());
    System.out.println("Current Deque: " + stack);
    System.out.println ("Peeking at the last element in the deque... because this is not just a stack, it's a deque");
    System.out.println("Last element: " + stack.peekLast());
    System.out.println("Current Deque: " + stack);


    // demo addition methods at the tail of the deque 
    System.out.println(" ");
    System.out.println("THIS SECTION SHOWS HOW A DEQUE CAN BE USED LIKE A QUEUE");
    System.out.println(" ");
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 1 to the end of the deque...");
    stack.addLast(1);
    System.out.println("Current Deque: " + stack);  
    System.out.println("Adding 2 to the end of the deque...");
    stack.addLast(2);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 3 to the end of the deque...");
    stack.addLast(3);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 4 to the end of the deque...");
    stack.addLast(4);
    System.out.println("Current Deque: " + stack);
    System.out.println("Adding 5 to the end of the deque...");
    stack.addLast(5);
    System.out.println("Current Deque: " + stack);
    System.out.println(" ");

    // demo removal methods at the tail of the deque
    System.out.println("Removing the first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next first element from the deque...");
    stack.removeFirst();
    System.out.println("Current Deque: " + stack);
    System.out.println(" ");
    System.out.println("We can also remove the last element from the deque...");
    System.out.println("Removing the last element from the deque...");
    stack.removeLast();
    System.out.println("Current Deque: " + stack);
    System.out.println("Removing the next last element from the deque...");
    stack.removeLast();
    System.out.println("Current Deque: " + stack);
    System.out.println(" ");
    System.out.println("Thank you!");

    System.out.println(" ");
    System.out.println(" ======== PROGRAM ENDED ======== ");

  }

}
