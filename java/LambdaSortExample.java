// Save as LambdaSortExample.java
import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lojitha");
        names.add("Vedha");
        names.add("Akash");
        names.add("Vignesh");

        System.out.println("Before Sorting:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sort using lambda expression
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("\nAfter Sorting:");
        names.forEach(name -> System.out.println(name));
    }
}
