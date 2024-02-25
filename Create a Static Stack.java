/*
Problem Statement: Implement a static stack that can hold up to 10 integers. 
Write functions for push and pop operations and ensure that
 your program can handle stack overflow and underflow conditions.
*/

public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        int[] stack = new int[capacity];
        int top = -1;

        // Push operation
        for (int i = 0; i < 11; i++) {
            if (top < capacity - 1) {
                stack[++top] = i;
                System.out.println("Pushed " + i + " onto the stack.");
            } else {
                System.out.println("Stack Overflow: Cannot push " + i + " onto a full stack.");
            }
        }

        System.out.println();

        // Pop operation
        for (int i = 0; i < 11; i++) {
            if (top >= 0) {
                int poppedItem = stack[top--];
                System.out.println("Popped " + poppedItem + " from the stack.");
            } else {
                System.out.println("Stack Underflow: Cannot pop from an empty stack.");
                break; // Exit loop if stack is empty
            }
        }
    }
}
