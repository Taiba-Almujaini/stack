
import java.util.Stack;

/*Problem Statement: Write a function that checks whether a stack is empty and returns true if it is,
 or false otherwise. Test your function by checking an empty stack and a stack with elements.
 */

public class Main {
    public static void main(String[] args) {

        Stack<Integer> emptyStack = new Stack<>();
        Stack<Integer> nonEmptyStack = new Stack<>();
        nonEmptyStack.push(7);
        nonEmptyStack.push(5);
        nonEmptyStack.push(3);

        // Check if the empty stack is empty
        boolean empty = emptyStack.isEmpty();
        System.out.println("Is the empty stack empty? " + empty); // Should print: true

        // Check if the non-empty stack is empty
        boolean NonEmpty = nonEmptyStack.isEmpty();
        System.out.println("Is the non-empty stack empty? " + NonEmpty); // Should print: false
    }

    }


