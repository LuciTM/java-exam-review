/* 
Use Scanner to simulate a grocery store checkout system.
Read the item name, quantity, and price per unit from the user.
Use a switch to apply discounts based on item categories (
e.g., "Fruits", "Vegetables", "Dairy").
Validate input using if/else: reject negative quantities or prices.
Use a while loop to allow the user to add multiple items until they enter "done".
Use a do-while loop to ensure the program runs at least once.
Store the receipt details in a 1D array (e.g., "Apples x 2 @ $3.00 each = $6.00").
Print the receipt using a for-each loop.
Bonus: Use a 2D array to store item name, quantity, price per unit, 
and total cost for each item, and print it as a table.
Bonus: Use break to exit the loop early if the user enters "STOP".
Bonus: Use continue to skip invalid inputs without terminating the program.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class ScannerCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use one ArrayList to hold a String array for each item. This is the
        // perfect structure to convert to a 2D array later.
        ArrayList<String[]> receiptItems = new ArrayList<>();
        double grandTotal = 0.0;
        double totalDiscountAmount = 0.0;
        String itemName;

        do {
            System.out.print("\nEnter item name (or 'done'/'STOP' to finish): ");
            itemName = sc.nextLine();

            if (itemName.equalsIgnoreCase("done") || itemName.equalsIgnoreCase("STOP")) {
                break;
            }

            // These must be declared outside the try block to be in scope for later calculations.
            int quantity;
            double price;

            try {
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                System.out.print("Enter price per unit: ");
                price = sc.nextDouble();

                // Consume the leftover newline character from nextDouble()
                sc.nextLine();

                if (quantity < 0 || price < 0) {
                    System.out.println("Error: Quantity and price cannot be negative. Item not added.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number. Item not added.");
                sc.nextLine(); // Clear the invalid input from the scanner
                continue;
            }

            double discountRate;

            // Loop to validate category input
            while (true) {
                System.out.print("Enter item category (e.g., Fruits, Vegetables, Dairy, Other): ");
                String category = sc.nextLine();
                boolean isValidCategory = true;

                switch (category.trim().toLowerCase()) {
                    case "fruits":
                        discountRate = 0.10; // 10%
                        break;
                    case "vegetables":
                        discountRate = 0.05; // 5%
                        break;
                    case "dairy":
                        discountRate = 0.08; // 8%
                        break;
                    case "other":
                        discountRate = 0.0; // No discount
                        break;
                    default:
                        System.out.println("Invalid category. Please enter 'Fruits', 'Vegetables', 'Dairy', or 'Other'.");
                        isValidCategory = false;
                }

                if (isValidCategory) {
                    break; // Exit validation loop if category was valid
                }
            }

            double itemGrossPrice = quantity * price;
            double itemDiscount = itemGrossPrice * discountRate;
            double itemTotal = itemGrossPrice - itemDiscount;
            totalDiscountAmount += itemDiscount;
            grandTotal += itemTotal;

            // Store all details for this one item in a String array.
            String[] itemData = {
                itemName,
                String.valueOf(quantity),
                String.format("%.2f", price),
                String.format("%.2f", itemTotal)
            };
            // Add the entire item record to our list.
            receiptItems.add(itemData);
            System.out.println(" " + itemName + " added to receipt.");
        } while (true);

        if (!receiptItems.isEmpty()) {
            System.out.println("\n===============================================================");
            System.out.println("                     FINAL RECEIPT");
            System.out.println("===============================================================");

            // 1. Create a 2D array of the exact size needed.
            String[][] receiptTable = new String[receiptItems.size()][4];

            // 2. Populate the 2D array from the ArrayList. This works now!
            receiptItems.toArray(receiptTable);

            // 3. Print the table header.
            System.out.printf("%-20s | %-10s | %-12s | %-12s\n", "Item", "Quantity", "Price/Unit", "Total Cost");
            System.out.println("---------------------------------------------------------------");

            // 4. Print the receipt contents from the 2D array.
            for (String[] row : receiptTable) {
                System.out.printf("%-20s | %-10s | $%-11s | $%-11s\n", row[0], row[1], row[2], row[3]);
            }

            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-46s $%.2f\n", "TOTAL DISCOUNT:", totalDiscountAmount);
            System.out.printf("%-46s $%.2f\n", "GRAND TOTAL:", grandTotal);
            System.out.println("===============================================================");
        } else {
            System.out.println("\nNo items were entered. Nothing to print.");
        }

        System.out.println("\nThank you for shopping with us!");
        sc.close();
    }
}