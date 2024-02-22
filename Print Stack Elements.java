/* • Problem Statement: Write a function to print all elements in a stack from
  top to bottom. Ensure that the stack remains unchanged after printing.
• Objective: Learn to access and display all elements in a stack.*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        for(Integer i=0; i<=5; i++){ //adding 10 elements to the stack
            stack.push(i);
        }

        System.out.println("Stack elements from top to bottom:");// Printing elements of the stack without modifying it
        for (Integer i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}