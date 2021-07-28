import java.util.Scanner;

public class inputTwoDArray {
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
                System.out.print("At : [" + i + "] [" + j + "] : ");
                array[i][j] = in.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }

}
