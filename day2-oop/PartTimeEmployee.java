/**
 * A concrete subclass representing a part-time employee.
 * It has its own fields and calculation logic.
 */
public class PartTimeEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        // Call the parent constructor (the one without salary)
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        // Part-time pay is calculated based on hours worked.
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public void printPayslip() {
        System.out.println("--- Part-Time Employee Payslip ---");
        System.out.println("ID: " + getId() + ", Name: " + getName());
        System.out.printf("Pay Calculated: %d hours @ $%.2f/hr = $%.2f\n\n", hoursWorked, hourlyRate, calculatePay());
    }
}
