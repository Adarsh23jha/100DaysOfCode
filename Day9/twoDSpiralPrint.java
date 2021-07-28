import java.util.*;

public class twoDSpiralPrint {
    static int spiralPrint(int a[][], int n, int m) {
        int row_start = 0, row_end = n - 1;
        int col_start = 0, col_end = m - 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        while (row_start <= row_end && col_start <= col_end) {
            // for Upper rows !!
            for (int col = col_start; col <= col_end; col++) {
                System.out.print(a[row_start][col] + " ");
            }
            row_start++;

            // for right side column !!
            for (int row = row_start; row <= row_end; row++) {
                System.out.print(a[row][col_end] + " ");
            }
            col_end--;

            // for Lower rows!!
            for (int col = col_end; col >= col_start; col--) {
                System.out.print(a[row_end][col] + " ");
            }
            row_end--;

            // for Left sid column!!
            for (int row = row_end; row >= row_start; row--) {
                System.out.print(a[row][col_start] + " ");
            }
            col_start++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the row size : ");
        n = in.nextInt();
        System.out.println("Enter the Column size : ");
        m = in.nextInt();

        int array[][] = new int[n][m];

        System.out.println("Enter The Array Element : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("At : [" + i + "] [" + j + "] -> ");
                array[i][j] = in.nextInt();

            }
        }
        spiralPrint(array, n, m);
    }

}
