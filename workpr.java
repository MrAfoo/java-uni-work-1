// ask user input for rows and columns of the matrix
// create a 2D array based on the user input
// ask user to input the values for the matrix
// print sum of its rows and sum of its columns and also sum of forward and reverse diagonal
import java.util.Scanner;
public class workpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input values for the matrix
        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate sum of rows and columns
        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];
        int forwardDiagonalSum = 0;
        int reverseDiagonalSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
                if (i == j) {
                    forwardDiagonalSum += matrix[i][j];
                }
                if (i + j == cols - 1) {
                    reverseDiagonalSum += matrix[i][j];
                }
            }
        }

        // Print sums of rows
        System.out.println("Sum of rows:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        // Print sums of columns
        System.out.println("Sum of columns:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + ": " + colSums[j]);
        }

        // Print sums of diagonals
        System.out.println("Sum of forward diagonal: " + forwardDiagonalSum);
        System.out.println("Sum of reverse diagonal: " + reverseDiagonalSum);

        sc.close();
    }
}
