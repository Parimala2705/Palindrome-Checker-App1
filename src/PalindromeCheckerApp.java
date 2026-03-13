/**
 * UseCase9PalindromeCheckerApp.java
 *
 * This class demonstrates palindrome checking using recursion.
 * It compares characters at the start and end recursively until
 * the base condition is reached.
 *
 * @author YourName
 * @version 9.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Recursive method to check if a string is a palindrome.
     *
     * @param str   The normalized string to check.
     * @param start The starting index.
     * @param end   The ending index.
     * @return true if palindrome, false otherwise.
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Application entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC9: Recursive Palindrome Checker ");
        System.out.println("=======================================\n");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces, lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using recursion
        if (isPalindromeRecursive(normalized, 0, normalized.length() - 1)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nApplication terminated successfully.");
        scanner.close();
    }
}