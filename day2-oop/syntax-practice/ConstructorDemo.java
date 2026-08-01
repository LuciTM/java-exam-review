// a class with a no-arg constructor and a 
// parameterized one; instantiate both.

// always sa taas dapat yung pub static void (if vscode)

public class ConstructorDemo {
    public static void main(String[] args){
        System.out.println("--- Creating a car using the no-arg constructor ---");
        Car defaultCar = new Car();
        defaultCar.displayDetails();

        System.out.println("\n--- Creating a car using the parameterized constructor ---");
        Car customCar = new Car ("Pagani Zonda R", 2022);
        customCar.displayDetails();
    }
}

// Simple class to demonstrate constructors
// It can be in the same file as long as it's not public
class Car { 
    String model; 
    int year;

    // 1. No-arg constructor
    // This is called when you create an object without providing any arguments.
    // It's useful for setting default values.
    public Car() {
        this.model = "Unknown";
        this.year = 2024; // A more realistic default year
        System.out.println("-> No-arg constructor was called. A car with default values has been created.");
    }

    // 2. Parameterized constructor
    // This constructor accepts arguments to initialize the object's fields.
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("-> Parameterized constructor was called. A specific car has been created.");
    }

    // A simple method to display the car's details
    public void displayDetails() {
        System.out.println("   Car Model: " + this.model + ", Year: " + this.year);
    }
}

