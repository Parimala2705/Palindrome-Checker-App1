/**
 * UseCase12PalindromeCheckerApp.java
 *
 * This class demonstrates the Strategy Pattern for palindrome checking.
 * Different algorithms (Stack, Deque) are encapsulated as strategies
 * and can be chosen dynamically at runtime.
 *
 * @author YourName
 * @version 12.0
 */

import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Concrete strategy: Stack-based palindrome check
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return normalized.equals(reversed.toString());
    }
}

// Concrete strategy: Deque-based palindrome check
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String input) {
        return strategy.checkPalindrome(input);
    }
}

// Application entry point
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC12: Strategy Pattern for Palindrome Algorithms ");
        System.out.println("=======================================\n");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Choose strategy dynamically
        System.out.println("\nChoose strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        PalindromeCheckerContext context;
        if (choice == 1) {
            context = new PalindromeCheckerContext(new StackStrategy());
        } else {
            context = new PalindromeCheckerContext(new DequeStrategy());
        }

        // Execute palindrome check
        if (context.executeCheck(input)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nApplication terminated successfully.");
        scanner.close();
    }
}