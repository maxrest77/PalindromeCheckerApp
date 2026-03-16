import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome Checker");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized)) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome (ignoring case and spaces).");
        }

        scanner.close();
    }
}
