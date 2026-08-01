/*
both written side-by-side in one program so 
the difference is obvious.
 */

public class OverloadVsOverride {
    public static void main(String[] args) {
        // overloading is resolved at compile time
        // the compiler knows which print() method to call based on the argument types
        Printer basePrinter = new Printer();
        // EXPECTED OUTPUT: "Printer: Hello, world!"
        // WHY: The compiler sees one String argument and matches it to print(String).
        basePrinter.print("Hello, world!");

        // EXPECTED OUTPUT: "Printer: Hello" (printed 3 times)
        // WHY: The compiler sees a String and an int, and matches it to the overloaded print(String, int).
        basePrinter.print("Hello", 3);

        // overriding is resolved at runtime
        // the JVM determines which draw() method to call based on the actual object type
        Printer colorPrinter = new ColorPrinter();
        // EXPECTED OUTPUT: "ColorPrinter: Hello, worlderu! in color!"
        // WHY: Even though the reference is 'Printer', the object is a 'ColorPrinter'.
        // At runtime, the JVM finds and executes the overridden method in the child class.
        colorPrinter.print("Hello, worlderu!");
    }
}

// base class (parent) defining overloaded methods
class Printer {
    // method 1 
    public void print(String message) {
        System.out.println("Printer: " + message);
    }

    // method 2 (overloaded) method 1
    public void print(String message, int times) { 
        for (int i = 0; i < times; i++) {
            System.out.println("Printer: " + message);
        }
    }
}

// subclass (child) overriding the print() method
class ColorPrinter extends Printer {
    // overriding the print() method
    // it has the exact same signature as the method in the parent class
    @Override
    public void print(String message){
        System.out.println("ColorPrinter: " + message + " in color!");
    }
    // Note: The overloaded print(String, int) method is not overridden here,
    // so it will still be available from the parent class.
    // The print (String, int) method is inherited automatically
}