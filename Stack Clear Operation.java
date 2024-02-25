/*

Implement a function to clear all elements from a stack, effectively resetting it to be empty.
Ensure your program can handle attempting to clear an already empty stack..
 */


import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");// get the number of element from the user
        int N = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter " + N + " numbers:"); // user enter the number one by one
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            stack.push(num);
        }
        // Handling an non empty stack
        System.out.println("Numbers in stack before clearing: :"+stack.toString());
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Numbers in stack after clearing: :"+stack.toString());


        // Handling an already empty stack
        Stack<Integer> emptyStack = new Stack<>();
        System.out.println("Numbers in stack before clearing (empty stack): " + emptyStack);
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Numbers in stack after clearing (empty stack): " + emptyStack);

        scanner.close();
    }
}