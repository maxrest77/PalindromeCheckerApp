import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PalindromeCheckerApp {

    // Method to check palindrome using both Queue and Stack
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        
        // Normalize input: remove spaces, punctuation, and convert to lowercase
        String normalizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Push to stack and enqueue to queue
        for (int i = 0; i < normalizedInput.length(); i++) {
            char c = normalizedInput.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        
        // Compare popped stack characters with dequeued queue characters
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false; // Not a palindrome
            }
        }
        
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Queue + Stack Based Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        boolean result = isPalindrome(input);
        
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
