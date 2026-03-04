public class ArrayExample {
    public static void main(String[] args) {
        // Initialize the 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}      // a[0][0]

                                    // a[0][1]

                                    // a[0][2]

                                    // a[1][0]

                                    // a[1][1]

                                     // a[1][2]
        };

        // Nested loop to print the values
        for (int i = 0; i < matrix.length; i++) {          // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {   // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Add a newline after each row
        }
    }
}
/*  
Step-by-Step Breakdown
Outer Loop Starts (i = 0): * The program looks at the first row: {1, 2, 3}.

Inner Loop (j): Runs for j = 0, j = 1, and j = 2.

Action: Prints 1, then 2, then 3.

Newline: System.out.println() moves the cursor to the next line.

Outer Loop Continues (i = 1):

The program moves to the second row: {4, 5, 6}.

Inner Loop (j): Resets and runs again for j = 0, j = 1, and j = 2.

Action: Prints 4, then 5, then 6.

Newline: Moves the cursor down again.

Termination: * i becomes 2. Since 2 is not less than matrix.length (which is 2), the outer loop exits.

here matrix[i].length means the number of columns in the current row i. This allows the inner loop to iterate through all the columns of that specific row, regardless of how many columns there are.

here matrix.length means the number of rows in the 2D array.in this code we have 2 rows and 3 columns, so matrix.length will return 2, and matrix[i].length will return 3 for each row.
*/