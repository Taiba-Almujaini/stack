/*

Problem Statement: Write a program that reads N numbers from the user,
 stores them in a stack, and then prints these numbers in reverse order by popping them from the stack.
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

        System.out.println("Numbers in reverse order:");//print numbers in the reverse order
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}