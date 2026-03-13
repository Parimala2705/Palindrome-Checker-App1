/**
 * UseCase6PalindromeCheckerApp.java
 *
 * This class demonstrates palindrome checking using both
 * Queue (FIFO) and Stack (LIFO) data structures.
 *
 * @author YourName
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Method to check if a string is a palindrome using Queue and Stack.
     *
     * @param input The string to check.
     * @return true if palindrome, false otherwise.
     */
    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Normalize input (remove spaces, lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Enqueue and push characters
        for (char ch : normalized.toCharArray()) {
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    // Application entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC6: Queue + Stack Based Check ");
        System.out.println("=======================================\n");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nApplication terminated successfully.");
        scanner.close();
    }
}