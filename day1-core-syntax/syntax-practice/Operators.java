public class Operators {
    public static void main(String[] args) {
        int a = 110;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println(" ");

        //  Assignment Operators
        a += b; // a = a + b
        a -= b; // a = a - b
        a *= b; // a = a * b
        a /= b; // a = a / b
        a %= b; // a = a % b

        System.out.println("Assignment Operators");
        System.out.println("a += b: " + a);
        System.out.println("a -= b: " + a);
        System.out.println("a *=b: " + a);
        System.out.println("a /= b: " + a);
        System.out.println("a %= b: " + a); 
        System.out.println(" ");


        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println("> : " + (a > b));
        System.out.println(">= : " + (a >= b));
        System.out.println("< : " + (a < b));
        System.out.println("<= : " + (a <= b));
        System.out.println("== : " + (a == b));
        System.out.println("!= : " + (a != b));
        System.out.println(" ");

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
        System.out.println("Logical NOT: " + (!y));
        System.out.println("Logical XOR: " + (x ^ y));
        System.out.println(" ");

        // Bitwise Operators
        System.out.println("Bitwise Operators");
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 2));
        System.out.println("Unsigned Right Shift: " + (a >>> 2));
        System.out.println(" ");

        // Unary Operators
        System.out.println("Unary Operators");
        System.out.println(" ");

        // postfix
        System.out.println("postfix increment: " + (a++));
        System.out.println("postfix decrement: " + (a--));
        System.out.println(" ");

        // prefix
        System.out.println("prefix increment: " + (++a));
        System.out.println("prefix decrement: " + (--a));
        System.out.println("unary plus: " + (+a));
        System.out.println("unary minus: " + (-a));
        System.out.println("bitwise NOT" + (~a));
        System.out.println("logical NOT: " + (!x)); // same goes w/ boolean y = false; 
        System.out.println(" ");

        // ternary Operator
        System.out.println("Ternary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);


    }
}