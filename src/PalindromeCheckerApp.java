/**
 * UseCase10PalindromeCheckerApp.java
 *
 * This class demonstrates palindrome checking while ignoring
 * spaces and case sensitivity. It normalizes the input string
 * before applying standard palindrome logic.
 *
 * @author YourName
 * @version 10.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Method to check if a string is a palindrome (case-insensitive, space-ignored).
     *
     * @param input The original string.
     * @return true if palindrome, false otherwise.
     */
    public static boolean isPalindrome(String input) {
        // Normalize input: remove spaces and non-alphanumeric characters, convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

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

    // Application entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC10: Case-Insensitive & Space-Ignored Check ");
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