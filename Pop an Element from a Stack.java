/* Problem Statement: Assuming you have a stack with some integers, 
write a function to remove (or "pop") an element from the stack. 
Print the element that was removed and the current stack contents..*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(1);
        stack.push(9);
        stack.push(4);
        stack.push(13);

        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int removedElement = stack.pop(); // Remove element from stack
            System.out.println("Removed element: " + removedElement);
            System.out.println("Current stack contents: " + stack);
        }
    }
}