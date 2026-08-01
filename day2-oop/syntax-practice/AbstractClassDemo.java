/*
AbstractClassDemo.java — one abstract method 
+ one concrete method; 
extend it and implement the abstract method.
 */

public class AbstractClassDemo {
    public static void main(String[] args) {
        // you cannot create an abstract class object directly
        // the line below would cause a compilation error
        // Vehicle vehicle = new Vehicle(); // Error: Vehicle is abstract; cannot be instantiated
        
        System.out.println("Creating a Car object"); // concrete subclass of Vehicle
        Car car = new Car();

        // 1. call the concrete method from the abstract class
        car.startEngine(); // Calls the concrete method from Vehicle class

        // 2. call the abstract method implemented in the subclass
        car.drive();
    }
}

// abstract class (parent)
abstract class Vehicle {
    // a concrete method with a body
    // this is inherited by all subclasses
    public void startEngine(){
        System.out.println("Engine started.");
    }

    // an abstract method without a body
    // it must be implemented by any concrete subclass
    public abstract void drive();
}

// concrete subclass (child)
class Car extends Vehicle {
    // implementing the abstract method from Vehicle
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}