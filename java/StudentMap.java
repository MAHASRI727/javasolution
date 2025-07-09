import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number of students to add: ");
            int count = Integer.parseInt(scanner.nextLine());

            // Add student entries
            for (int i = 0; i < count; i++) {
                System.out.print("Enter student ID (integer): ");
                int id = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                studentMap.put(id, name);
            }

            // Retrieve a student by ID
            System.out.print("Enter ID to search: ");
            int searchId = Integer.parseInt(scanner.nextLine());

            if (studentMap.containsKey(searchId)) {
                System.out.println("Student Name: " + studentMap.get(searchId));
            } else {
                System.out.println("No student found with ID: " + searchId);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric ID values.");
        } finally {
            scanner.close();
        }
    }
}
