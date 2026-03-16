import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    // Method to check palindrome using stack
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        // Pop characters from stack and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        // Compare original string with reversed string
        return input.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        // Optional: remove spaces and convert to lowercase for flexible comparison
        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        boolean result = isPalindrome(normalizedInput);
        
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
