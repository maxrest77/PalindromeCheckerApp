public class PalindromeChecker {

    // Application information
    static final String APP_NAME = "Palindrome Checker Management System";
    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        // UC1: Display welcome message
        displayWelcomeMessage();

        // UC2: Hardcoded string to check
        String word = "madam";
        checkPalindromeWithTwoPointers(word);

        System.out.println("\nThank you for using " + APP_NAME + "!");
    }

    // Display welcome message
    public static void displayWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("   Welcome to " + APP_NAME);
        System.out.println("         Version: " + APP_VERSION);
        System.out.println("=====================================\n");
    }

    // Check palindrome using two-pointer technique
    public static void checkPalindromeWithTwoPointers(String str) {
        // Convert string to character array
        char[] chars = str.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters from start and end
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + str + "\" is a palindrome (two-pointer check).");
        } else {
            System.out.println("The word \"" + str + "\" is not a palindrome (two-pointer check).");
        }
    }
}