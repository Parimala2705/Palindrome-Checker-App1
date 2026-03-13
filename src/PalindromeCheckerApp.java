/**
 * UseCase8PalindromeCheckerApp.java
 *
 * This class demonstrates palindrome checking using a singly linked list.
 * It uses fast/slow pointers to find the middle, reverses the second half,
 * and compares both halves for palindrome validation.
 *
 * @author YourName
 * @version 8.0
 */

import java.util.Scanner;

// Node class for singly linked list
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    Node head;

    // Insert character at end
    public void insert(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check if linked list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using fast/slow pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        return true;
    }

    // Reverse linked list
    private Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

// Application entry point
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Palindrome Checker Application ");
        System.out.println(" UC8: Linked List Based Check ");
        System.out.println("=======================================\n");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces, lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert string to linked list
        LinkedList list = new LinkedList();
        for (char ch : normalized.toCharArray()) {
            list.insert(ch);
        }

        // Check palindrome
        if (list.isPalindrome()) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nApplication terminated successfully.");
        scanner.close();
    }
}