// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.print("Generic Animal: ");
        genericAnimal.makeSound();  // Calls base class method

        System.out.print("Dog: ");
        myDog.makeSound();          // Calls overridden method
    }
}

