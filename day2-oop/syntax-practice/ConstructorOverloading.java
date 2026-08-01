// 2–3 constructors with different parameter lists in the same class. 

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 1. no args constructor
        System.out.println("No args constructor");
        Car car1 = new Car();
        car1.displayDetails();
        
        // 2. one-arg constructor
        System.out.println("One arg constructor");
        Car car2 = new Car("Pagani Zonda R");
        car2.displayDetails();

        // 3. two-arg constructor
        System.out.println("Two args constructor"); 
        Car car3 = new Car("Pagani Zonda R", 2022);
        car3.displayDetails();
    }
}

// This class demonstrates constructor overloading.
// It can be in the same file as long as it's not public.
class Car {
    String model;
    int year;

    // Constructor 1: No arguments (No-Arg Constructor)
    // PURPOSE: To create a "default" object when no details are provided.
    // It calls the two-argument constructor with default values using this().
    // best when you need a blank or default object    
    public Car() {
        this("Unknown", 2024); // This MUST be the first line.
        System.out.println("-> No-arg constructor finished its own work.");
    }

    // Constructor 2: One argument (Parameterized Constructor)
    // PURPOSE: To create an object when only some information (the model) is known.
    // It calls the two-argument constructor, providing a default for the missing value.
    // convenience constructor (partial information provided)
    public Car(String model) {
        this(model, 2024); // This MUST be the first line.
        System.out.println("-> One-arg constructor finished its own work.");
    }

    // Constructor 3: Two arguments (Main/Designated Parameterized Constructor)
    // PURPOSE: To create a fully initialized object when all details are known.
    // This is the "main" constructor that does the actual work of setting fields.
    // The other constructors "chain" to this one to avoid duplicating code.
    // use this if the information are provided up-front
    public Car(String model, int year) {
        System.out.println("-> Two-arg (main) constructor called to do the heavy lifting.");
        this.model = model;
        this.year = year;
    }

    // A simple method to display the car's details
    public void displayDetails() {
        System.out.println("   Car Details -> Model: " + this.model + ", Year: " + this.year);
    }
}
