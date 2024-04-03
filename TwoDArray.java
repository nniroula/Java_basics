import java.util.Arrays;

public class TwoDArray {
    public static void main(String []args){
        // create 2D array
        int [][] matrix = new int[2][3]; // 2 rows 3 columns
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.println(Arrays.toString(matrix)); // prints reference object, use deepToString()
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Row count = " + matrix.length); // returns number of rows
        System.out.println("Column count = " + matrix[0].length); // returns number of columns

        System.out.println();
        System.out.println("Nested for loop.....");
        // print each element
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

        // declare array and initialize it once
        double[][] floats = {
            {2.0, 3.4, 5.1},
            {1.1, 3.9, 4.8}
        };
        System.out.println("initialized array....");
        System.out.println(Arrays.deepToString(floats));
    }
}
