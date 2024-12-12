/*
Problem Statement:
• Define a 2D array (matrix) with 3 rows and 3 columns.
• Populate the matrix with numbers from 1 to 9.
*/

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Define a 2D array (matrix) with 3 rows and 3 columns
        int[][] matrix = new int[3][3];

        // Populate the matrix with numbers from 1 to 9
        int num = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num++;
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
