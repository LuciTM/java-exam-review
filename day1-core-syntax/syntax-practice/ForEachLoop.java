public class ForEachLoop {
    public static void main(String[] args){
        //  iterate over an array and print each element with a manually tracked index.
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        int index = 0;

        System.out.println("Iterating over the array using a for-each loop:");
        for (String fruit : fruits) { 
            System.out.println("Index: " + index + ", Fruits: " + fruit);
            index++;
        }
    }
}