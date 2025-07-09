public class MethodOverloading {
    
    // Method 1: Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 3 (int): " + add(5, 3));
        System.out.println("Sum of 2.5 and 3.8 (double): " + add(2.5, 3.8));
        System.out.println("Sum of 1, 2, and 3 (int): " + add(1, 2, 3));
    }
}
