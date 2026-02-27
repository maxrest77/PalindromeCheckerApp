public class UC2 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }
    }
}