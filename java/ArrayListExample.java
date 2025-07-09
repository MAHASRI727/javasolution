import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding names in the required order
        names.add("Akash");
        names.add("Lojitha");
        names.add("Vedha");
        names.add("Vignesh");

        System.out.println("Names in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nFirst name in list: " + names.get(0));

        names.remove("Lojitha");
        System.out.println("\nAfter removing 'Lojitha': " + names);

        System.out.println("Size of list: " + names.size());

        if (names.contains("Vedha")) {
            System.out.println("Vedha is in the list.");
        }

        names.clear();
        System.out.println("List after clear(): " + names);
    }
}
