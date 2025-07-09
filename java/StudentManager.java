// Save as StudentManager.java
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

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();
    private int currentId = 1;

    // Simulate INSERT
    public void insertStudent(String name, int age) {
        Student student = new Student(currentId++, name, age);
        studentList.add(student);
        System.out.println("Inserted: " + student);
    }

    // Simulate UPDATE by ID
    public void updateStudent(int id, String newName, int newAge) {
        boolean found = false;
        for (Student s : studentList) {
            if (s.id == id) {
                s.name = newName;
                s.age = newAge;
                System.out.println("Updated: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // View all students
    public void showAllStudents() {
        System.out.println("\nAll Students:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.insertStudent("Akash", 20);
        manager.insertStudent("Vedha", 21);
        manager.insertStudent("Lojitha", 19);

        manager.showAllStudents();

        manager.updateStudent(2, " Sri", 22);
        manager.updateStudent(5, "Unknown", 30); // Non-existent ID

        manager.showAllStudents();
    }
}
