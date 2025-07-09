public class TypeCastingExample {
    public static void main(String[] args) {
        // Widening (int → double) - Implicit
        int intVal = 67;
        double widened = intVal; // implicit casting
        System.out.println("Original int: " + intVal);
        System.out.println("Widened to double: " + widened);

        // Narrowing (double → int) - Explicit
        double doubleVal = 87.27;
        int narrowed = (int) doubleVal; // explicit casting
        System.out.println("Original double: " + doubleVal);
        System.out.println("Narrowed to int: " + narrowed);
    }
}
