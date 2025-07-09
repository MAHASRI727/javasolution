import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class BasicJdbcConnection {
    public static void main(String[] args) {
        // Simulated data
        List<Student> students = Arrays.asList(
            new Student(1, "Akash", 20),
            new Student(2, "Vedha", 21),
            new Student(3, "Lojitha", 19)
        );

        System.out.println("ID\tName\t\tAge");
        System.out.println("-------------------------");

        for (Student s : students) {
            System.out.printf("%d\t%-10s\t%d%n", s.id, s.name, s.age);
        }
    }
}
