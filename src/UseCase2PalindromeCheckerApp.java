// UC2: Print a Hardcoded Palindrome Result
public class UseCase2PalindromeCheckerApp {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Palindrome check using conditional statement
        if (isPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }

    // Helper method to check palindrome
    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}