/*
 private fields + getters/setters, with basic 
 validation in a setter (e.g. reject a negative value).
 */

public class Encapsulation {
    public static void main (String[] args) { 
        BankAccount account = new BankAccount();

        System.out.println("Initial balance: " + account.getBalance());
       
        System.out.println("Depositing a valid amount of: 100.0");
        account.deposit(100.0);
        System.out.println("Current balance: " + account.getBalance());

        System.out.println("Attempting to deposit an invalid amount of: -50.0");
        account.deposit(-50.0);
        System.out.println("Current balance: " + account.getBalance());

        System.out.println("Attempting to withdraw a valid amount of: 30.0");
        account.withdraw(30.0);
        System.out.println("Current balance: " + account.getBalance());

        System.out.println("Attempting to withdraw more than the balance: 100.0");
        account.withdraw(200.0);
        System.out.println("Current balance: " + account.getBalance());
    }
}

class BankAccount {
    // 1. Private field to store the balance   
    private double balance;
    
    // 2. Public getter for balance
    public double getBalance() {
        return this.balance;
    }

    // 3. Public method to deposit money with validation
    public void deposit (double amount){
        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else { 
            System.out.println("Deposit failed: Amount must be non-negative.");
        }
    }

    // 4. Public method to withdraw money with validation
    public void withdraw (double amount){ 
        if (amount >= 0 && amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Amount must be non-negative and less than or equal to the current balance.");
        }
    }
}