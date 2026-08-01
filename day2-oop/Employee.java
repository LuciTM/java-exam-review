/**
 * Abstract base class for all employee types.
 * It demonstrates:
 * - Encapsulation (private fields, public getters/setters)
 * - Abstraction (abstract method)
 * - Constructor Overloading
 * - 'this' keyword usage
 */

public abstract class Employee {
    private String name;
    private int id; 
    private double baseSalary;

    // Constructor Overloading
    public Employee (String name, int id) {
        this.name = name; 
        this.id = id;
    }

    // constructor with baseSalary parameter shadow
    public Employee (String name, int id, double baseSalary) {
        this (name, id); // calls the first constructor
        // this keyword is used to refer to the current object's baseSalary field
        this.baseSalary = baseSalary; 
    }

    // Abstract method - a contract forcing subclasses to implement pay calculation
    public abstract double calculatePay();

    // Getters and Setters
    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public int getId() {
        return id;
    }
     
    public double getBaseSalary() {
        return baseSalary;
    }
}