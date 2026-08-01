/*
 MethodOverriding.java — override a parent method with @Override; 
 call super.method() inside it.
 */

public class MethodOverriding {
    public static void main(String[] args) {
      Circle circle = new Circle();
      circle.draw(); // Calls the overridden draw() method in Circle class
    }
}

// base class (parent)
class Shape {
    // base method
    public void draw() { 
        System.out.println("Drawing a shape.");
    }
}

// subclass (child)
class Circle extends Shape {
    // overriding the draw() method
    @Override
    public void draw() { 
        // calling the parent class's draw() method
        super.draw();
        System.out.println("Drawing a circle.");
    }
}