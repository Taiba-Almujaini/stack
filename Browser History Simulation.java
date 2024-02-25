/*
Problem Statement: Simulate a browser's back button using a stack. Allow the user to enter webpage URLs,
push each URL onto a stack as they are visited, and pop the last URL when the user hits the back button.
 */

import java.util.Scanner;
import java.util.Stack;

public class BrowserSimulator {

    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        String currentUrl = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter URL to visit or 'back' to go back: ");
            String input = scanner.nextLine();

            if (input.equals("back")) {
                if (!history.isEmpty()) {
                    currentUrl = history.pop();
                    System.out.println("Going back to: " + currentUrl);
                } else {
                    System.out.println("Can't go back further. History is empty.");
                }
            } else {
                history.push(currentUrl);
                currentUrl = input;
                System.out.println("Visiting: " + currentUrl);
            }
        }
    }
}