public class Array2D {
    public static void main(String[] args){
     // a 2D array printed as a grid, with row and column sums.
        int [][] matrix = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        matrix[0][0] = 10; // change the first element to 10

        for (int i = 0; i < rows; i++) { 
            int rowSum = 0;
            for (int j = 0; j < column; j++){
                rowSum += martrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}