/*
 an array/list of the parent type filled with subclass objects; 
 loop and call an overridden method.
 */

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        // 1. Create a list of the PARENT type (Shape).
        // This list can hold any object that IS-A Shape (i.e., Shape, Circle, Square).
        List<Shape> shapes = new ArrayList<>();

        // 2. Fill the list with objects of SUBCLASS types.
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Shape()); // Add a base type object as well

        System.out.println("--- Demonstrating Polymorphism ---");
        System.out.println("Looping through a list of Shapes and calling draw():\n");

        // 3. Loop and call the same method on each object.
        /*
         EXPECTED OUTPUT:
         Drawing a circle(O)
         Drawing a square([ ])
         Drawing a generic shape.
        */
        for (Shape shape : shapes) {
            // WHY: At RUNTIME, the JVM determines the actual object type (Circle, Square, or Shape)
            // and calls the appropriate overridden method. This is polymorphism.
            shape.draw();
        }
    }
}

// these classes can be reused from the previous example
// base class (parent)
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

// subclass 1
class Circle extends Shape {
    @Override 
    public void draw() {
        System.out.println("Drawing a circle(O)");
    }
}

// subclass 2
class Square extends Shape {
    @Override
    public void draw() { 
        System.out.println("Drawing a square ([ ]).");
    }
}