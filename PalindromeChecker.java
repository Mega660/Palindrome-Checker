import java.util.Scanner;

public class PalindromeChecker {

    // Method to clean input (remove non-alphanumeric chars and lowercase)
    public static String cleanInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Method to check if string is palindrome
    public static boolean isPalindrome(String input) {
        String cleaned = cleanInput(input);
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Palindrome Checker ===");
            
            System.out.print("Enter a word, number, or phrase: ");
            String userInput = scanner.nextLine();
            
            if (isPalindrome(userInput)) {
                System.out.println("\"" + userInput + "\" is a palindrome!");
            } else {
                System.out.println("\"" + userInput + "\" is NOT a palindrome.");
            }
        }
    }
}