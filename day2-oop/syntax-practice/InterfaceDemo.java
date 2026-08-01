/*
 InterfaceDemo.java — a small interface with 1–2 methods, 
 implemented in a class.
 */

public class InterfaceDemo {
    public static void main(String[] args) {
        // 1. Create an object of the concrete class.
        SimpleLogger logger = new SimpleLogger();
        // EXPECTED OUTPUT: "INFO: System started successfully."
        // WHY: A direct call to the logInfo method on the SimpleLogger object.
        logger.logInfo("System started successfully.");
        // EXPECTED OUTPUT: "ERROR: Configuration file not found."
        // WHY: A direct call to the logError method on the SimpleLogger object.
        logger.logError("Configuration file not found.");

        // 2. Polymorphic use: An interface reference can hold an object
        //    of any class that implements it.
        System.out.println("\n--- Using interface as a type ---");
        Loggable loggable = new SimpleLogger();
        // EXPECTED OUTPUT: "INFO: This message is logged via the interface reference."
        // WHY: Even though the reference type is 'Loggable', the JVM knows the
        // actual object is a 'SimpleLogger' at runtime and calls its specific
        // implementation of the logInfo method. This is polymorphism.
        loggable.logInfo("This message is logged via an interface reference.");
    }
}

// interface definition
// by default, all methods in an interface are public and abstract
interface Loggable {
    void logInfo(String message);
    void logError(String message);
}

// implements the Loggable interface
// promising to provide a body for all its methods.
class SimpleLogger implements Loggable {
    @Override 
    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    // It's a best practice to add @Override here as well.
    @Override
    public void logError(String message) {
        System.out.println("ERROR: " + message);
    }
}