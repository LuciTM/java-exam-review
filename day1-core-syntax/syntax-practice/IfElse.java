public class IfElse {
    public static void main(String[] args) {
        // (1) simple if/else
        if (true) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }

        System.out.println(" ");

        // (2) if/else-if chain 4+ branches
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        System.out.println(" ");

        // (3) nested if/else
        int age = 20;
        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You are an adult and can drink alcohol");
            } else {
                System.out.println("You are an adult but cannot drink alcohol");
            }
        } else {
            System.out.println("You are a minor");
        }
    }
}