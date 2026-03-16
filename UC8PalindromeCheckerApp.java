import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to convert string to linked list
    private static Node stringToLinkedList(String str) {
        Node head = null, tail = null;
        for (char ch : str.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse a linked list and return new head
    private static Node reverseList(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Check if linked list is palindrome
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Use fast and slow pointers to find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalfStart = reverseList(slow.next);
        Node firstHalfStart = head;

        // Compare two halves
        Node p1 = firstHalfStart;
        Node p2 = secondHalfStart;
        boolean palindrome = true;
        while (p2 != null) {
            if (p1.data != p2.data) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: restore original list
        slow.next = reverseList(secondHalfStart);

        return palindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC8: Linked List Based Palindrome Checker");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Preprocess: remove spaces and convert to lowercase
        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();

        Node head = stringToLinkedList(formattedInput);

        if (isPalindrome(head)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
