import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*Problem Statement: Write a function to print all elements in a stack from top to bottom.
 Ensure that the stack remains unchanged after printing.*/

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println("Value after push " + stack.peek()); //peek() method to retrieve the top element of the stack without removing it and print it ,
        stack.push(2);
        System.out.println("Value after push: " + stack.peek());
        stack.push(3);
        System.out.println("Value after push: " + stack.peek());













        }
    }
