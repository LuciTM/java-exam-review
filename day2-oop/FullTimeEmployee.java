/**
 * A concrete subclass representing a full-time employee.
 * It demonstrates:
 * - Inheritance (extends Employee)
 * - Interface Implementation (implements Payable)
 * - Method Overriding (@Override)
 */
public class FullTimeEmployee extends Employee implements Payable {

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        // Call the parent constructor to initialize name, id, and baseSalary
        super(name, id, monthlySalary);
    }

    @Override
    public double calculatePay() {
        // For a full-time employee, the pay is their fixed monthly salary.
        return getBaseSalary();
    }

    @Override
    public void printPayslip() {
        System.out.println("--- Full-Time Employee Payslip ---");
        System.out.println("ID: " + getId() + ", Name: " + getName());
        System.out.printf("Monthly Salary: $%.2f\n\n", calculatePay());
    }
}
