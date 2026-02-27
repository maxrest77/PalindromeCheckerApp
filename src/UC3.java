public class PalindromeChecker {

    // Application information
    static final String APP_NAME = "Palindrome Checker Management System";
    static final String APP_VERSION = "1.0";

    // Entry point
    public static void main(String[] args) {

        // UC1: Display welcome message
        displayWelcomeMessage();

        // UC2: Check a hardcoded palindrome
        String word = "madam"; // Hardcoded string
        checkPalindrome(word);

        // Program exit
        System.out.println("\nThank you for using " + APP_NAME + "!");
    }

    // Method to display welcome message
    public static void displayWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("   Welcome to " + APP_NAME);
        System.out.println("         Version: " + APP_VERSION);
        System.out.println("=====================================\n");
    }

    // Method to check if a string is a palindrome
    public static void checkPalindrome(String str) {
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Check palindrome using if-else
        if (str.equals(reversed)) {
            System.out.println("The word \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + str + "\" is not a palindrome.");
        }
    }
}