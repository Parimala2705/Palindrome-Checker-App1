// UC3: Palindrome Check Using String Reverse
public class UseCase3PalindromeCheckerApp {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            // String concatenation builds the reversed string
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed using equals()
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}