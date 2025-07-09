// File: ReflectionFruit.java
import java.lang.reflect.*;

class Fruit {
    private String apple = "Red and sweet";
    public String banana = "Yellow and soft";
    private String grape = "Small and juicy";
    public String mango = "King of fruits";

    public void listFruits() {
        System.out.println("Fruits are healthy and delicious!");
    }

    private void secretJuice() {
        System.out.println("Blend apple and grape for tasty juice!");
    }
}

public class ReflectionFruit {
    public static void main(String[] args) throws Exception {
        // Get the Class object
        Class<?> cls = Fruit.class;

        // Print class name
        System.out.println("Class: " + cls.getName());

        // Print all constructors
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println("  " + constructor);
        }

        // Print all fields
        System.out.println("\nFields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println("  " + field.getName());
        }

        // Print all methods
        System.out.println("\nMethods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println("  " + method.getName());
        }

        // Create an object of Fruit
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Invoke public method
        System.out.println("\nInvoking listFruits():");
        Method listMethod = cls.getMethod("listFruits");
        listMethod.invoke(obj);

        // Invoke private method using reflection
        System.out.println("\nInvoking private method secretJuice():");
        Method secretMethod = cls.getDeclaredMethod("secretJuice");
        secretMethod.setAccessible(true); // allow private access
        secretMethod.invoke(obj);
    }
}
