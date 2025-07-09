import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }

        scanner.close();
    }
}
