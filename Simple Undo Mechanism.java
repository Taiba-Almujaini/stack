/*
Problem Statement: Simulate a very simple undo mechanism using a stack. Every time a user types a character,
 push it onto the stack. If the user hits undo (you can simulate this with a command), 
pop the last character from the stack and print the current state of the text.
*/

import java.util.Stack;
import  java.util.Scanner;
public class SimpleUndoMechanism {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> undo = new Stack<>();
        System.out.println("Enter a character or 'undo' to undo:");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("undo")) {
                // User wants to undo the last character
                if (!undo.isEmpty()) {
                    undo.pop();
                }
            } else {
                // User types a character, push it onto the stack
                for (char c : userInput.toCharArray()) {
                    undo.push(c);
                }
            }

            // Print the current state of the text

            System.out.print("Current text: ");
            for (char c : undo) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}