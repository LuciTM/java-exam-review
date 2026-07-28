import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {    
    Scanner input = new Scanner(System.in);
    int choice; 

    do {
        System.out.println("--- Menu ---");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("You selected Option 1.");
                break;
            case 2: 
                System.out.println("You selected Option 2.");
                break;
            case 3:
                System.out.println("Exiting the program.");
                break;
            default: 
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        input.close();
    }
}