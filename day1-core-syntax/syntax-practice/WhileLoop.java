import java.util.Scanner;

public class WhileLoop{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.print("Enter a number (or -1 to quit): ");
        number = input.nextInt();

        while (number != -1){
            if (number >= 0) {
                sum += number;
            } else {
            System.out.println("Please enter a non-negative number or -1 to quit.");
        }

        System.out.print("Enter a number (or -1 to quit): ");
        number = input.nextInt();

        }

        System.out.println("\nLoop has ended.");
        System.out.println("The sum of the numbers entered is: " + sum);
        input.close();
    
    }
}