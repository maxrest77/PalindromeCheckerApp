import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC6: Queue + Stack Based Palindrome Check");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();

      
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

 
        for (char ch : formattedInput.toCharArray()) {
            queue.add(ch); 
            stack.push(ch); 
        }


        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); 
            char fromStack = stack.pop();   
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

    
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
