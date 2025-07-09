import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        // Reading array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
