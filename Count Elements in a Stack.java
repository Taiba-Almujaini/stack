
import java.util.Stack;

/*Problem Statement: Implement a function to count the number of elements in a stack without removing any of them.
Hint: You might need to use a temporary stack to hold elements while you count them.
 */

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stack<Integer> tempStack = new Stack<>();
        int count = 0;
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
            count++;
        }

        // Move elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        System.out.println("Number of elements in stack: " + count);  // Output: 4
    }

    }


