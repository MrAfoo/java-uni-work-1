public class arr {
    public static void main(String[] args) {
int[][] b = {{3,1, 9}, {4, 7, 1}};
int[][] a = {{1,2, 3}, {4, 5, 6} };  // a[0][0]

                                    // a[0][1]

                                    // a[0][2]

                                    // a[1][0]

                                    // a[1][1]

                                     // a[1][2]
int[][] c = new int[2][3]; // create a new matrix to store the result
for (int r = 0 ; r < 2; r++)
{
    for (int i = 0; i < 3; i++)
    {
        c[r][i] = a[r][i] + b[r][i];
        System.out.print(c[r][i]+ " ");
    }
    System.out.println();
}
    }
}

