import java.util.Scanner;

public class countPairsWithSum {
    static int getPairCounter(int arr[], int n, int x) {
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x == arr[i] + arr[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the array size : ");
        n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter k : ");
        int k = in.nextInt();

        System.out.print("Enter The array element : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        getPairCounter(array, n, k);
        // System.out.println(Inversion(array));

        in.close();

    }

}
