public class Array1D { 
    public static void main(String[] args) {
        // a 1D array declared 3 ways (literal, new int[], loop-filled).
        int [] arr1= {1, 2, 3, 4, 5};
        int [] arr2= new int[5];
        int [] arr3= new int[10];
        
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.println(arr3[i]);
        }
    }
}