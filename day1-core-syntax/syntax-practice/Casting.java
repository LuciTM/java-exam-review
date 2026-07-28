public class Casting {
    public static void main(String[] args) {
        int myInt = 17;
        double myDouble = myInt; // Implicit casting (int to double)
        System.out.println("Implicit Casting: " + myDouble); //output : 17.0?

        int myInt2 = 17; // Explicit casting (double to int)
        double myDouble2 = 8.32;
        myInt2 = (int) myDouble2; // Explicit casting (double to int)
        System.out.println("Explicit Casting: " + myInt2);
    
    }
}

