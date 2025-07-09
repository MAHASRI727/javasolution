import java.util.Scanner;

public class RecursiveFibonacci {
    // Recursive method to return the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position (n) to get Fibonacci number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Fibonacci number is not defined for negative indices.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        scanner.close();
    }
}
