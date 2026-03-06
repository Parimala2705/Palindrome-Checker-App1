// UC4: Character Array Based Palindrome Check
public class UseCase4PalindromeCheckerApp {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}

