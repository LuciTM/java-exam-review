import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate polymorphism with the Employee hierarchy.
 */

public class PayrollMain {
    public static void main(String[] args) {
        // 1. create a list of PARENT type
        List<Employee> employees = new ArrayList<>();

        // 2. create a list of SUBCLASS type
        employees.add(new FullTimeEmployee("Alice", 1, 50000));
        employees.add(new PartTimeEmployee("Bob", 2, 20, 30));  
        employees.add(new FullTimeEmployee("Charlie", 3, 60000));

        System.out.println("Processing Payroll");

        // 3. iterate over the list and call the printPayslip method
        for (Employee emp : employees) {
            Payable payable = (Payable) emp; // downcasting to Payable
            payable.printPayslip(); // polymorphic call
        }

    }
}