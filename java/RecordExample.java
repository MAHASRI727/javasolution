// Save as RecordExample.java
import java.util.*;
import java.util.stream.Collectors;

// Define a record (immutable class)
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        // Create list of people
        List<Person> people = List.of(
            new Person("Akash", 22),
            new Person("Vedha", 19),
            new Person("Vignesh", 17),
            new Person("Lojitha", 21)
        );

        // Print all people
        System.out.println("All Persons:");
        people.forEach(System.out::println);

        // Filter: age >= 18
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        // Print adults
        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}
