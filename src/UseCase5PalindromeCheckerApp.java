// UC5: Stack-Based Palindrome Checker
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}

