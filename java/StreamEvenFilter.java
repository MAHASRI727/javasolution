// Save as StreamEvenFilter.java
import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 45, 88, 66, 78, 11, 57);

        System.out.println("Original List: " + numbers);

        // Stream filter for even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
