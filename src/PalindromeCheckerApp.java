/**
 * UseCase11PalindromeCheckerApp.java
 *
 * This class demonstrates an object-oriented approach to palindrome checking.
 * The PalindromeChecker class encapsulates the logic and exposes a single
 * responsibility method checkPalindrome().
 *
 * @author YourName
 * @version 11.0
 */

import java.util.Scanner;

// Encapsulated PalindromeChecker class
class PalindromeChecker {
    /**
     * Method to check if a string is a palindrome.
     * Normalizes input by removing spaces and converting to lowercase.
     *
     * @param input The original string.
     * @return true if palindrome, false otherwise.
     */
    public boolean checkPalindrome(String input) {
        // Normalize input
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Application entry point
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC11: Object-Oriented Palindrome Service ");
        System.out.println("=======================================\n");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Use the encapsulated PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nApplication terminated successfully.");
        scanner.close();
    }
}