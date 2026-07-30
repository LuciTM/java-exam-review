public class BreakContinue {
    public static void main(String[] args){
        // one loop using continue to skip a value, one using break to exit early.
        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue;
            } else if (i == 8){
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}