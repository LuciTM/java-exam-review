
/* 
- Store item names and prices in **arrays** (name array + price array).
- Simulate quantities per item using a second array or a 2D array (item, quantity).
- Use a `for` loop to calculate subtotal per item and a running grand total.
- Apply a discount using **if/else-if**: no discount under ₱500, 5% off 
₱500–999, 10% off ₱1000+.
- Use a **switch** to print a payment method label from a numeric code 
(1 = Cash, 2 = Card, 3 = GCash).
- Print a formatted "receipt": item, quantity, price, subtotal, total.
- Bonus: `continue` to skip items with quantity 0; `break` to stop early if 
a "STOP" code is entered.
*/


public class GroceryReceiptCalculator {
    public static void main(String[] args) {
        String [] itemNames = {"Apples", "Bananas", "Carrots", "Dates", "Eggs"};
        double [] itemPrices = {50.0, 30.0, 20.0, 100.0, 10.0};
        int [] itemQuantities = {2, 0, 5, 1, 12}; // Simulated 
        double grandTotal;

        System.out.println("Grocery Receipt");
        System.out.println("----------------------------");
        System.out.println("Item\tQuantity\tPrice\tSubtotal");
        System.out.println("----------------------------");
        grandTotal = 0.0;

        for (int i = 0; i < itemNames.length; i++) {
            if (itemQuantities[i] == 0) {
                continue; // Skip items with quantity 0
            }
            double subtotal = itemPrices[i] * itemQuantities[i];
            grandTotal += subtotal;
            System.out.printf("%s\t%d\t\t%.2f\t%.2f\n", itemNames[i], itemQuantities[i], itemPrices[i], subtotal);
        }

        System.out.println("----------------------------");
        System.out.printf("Grand Total: %.2f\n", grandTotal);

        // Apply discount
        double discount = 0.0;
        if (grandTotal < 500){
            discount = 0.0;
        } else if (grandTotal >= 500 && grandTotal <= 999){
            discount = grandTotal * 0.05;
        } else if (grandTotal >= 1000){
            discount = grandTotal * 0.10;
        }

        double finalTotal = grandTotal - discount;

        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Total:  %.2f\n" + finalTotal);
        System.out.println("----------------------------");
        System.out.println(" ");

        System.out.println("Payment Method");
        System.out.println("----------------------------");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. GCash");
        
        int paymentCode = 2; 

        switch (paymentCode){
            case 1: 
                System.out.println("You picked Cash");
                break;
            case 2: 
                System.out.println("You picked Card");
                break;
            case 3: 
                System.out.println("You picked GCash");
                break;    
            default:
                System.out.println("Invalid payment method");
        }
        
    }
}