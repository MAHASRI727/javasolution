class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Make  : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);
        System.out.println("------------------------");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating Car objects
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2023);

        // Displaying details
        car1.displayDetails();
        car2.displayDetails();
    }
}
