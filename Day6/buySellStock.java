import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class buySellStock {
    static int buyNsell(int a[], int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            min = Math.min(min, a[i]);
        }
        int minIndex = search(a, min);
        if (minIndex == a.length - 1) {
            return 0;
        }
        for (int i = minIndex + 1; i < a.length; i++) {
            max = Math.max(max, a[i]);

        }
        int maxIndex = search(a, max);
        System.out.println(maxIndex);

        return 0;
    }

    static int search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the array size : ");
        n = in.nextInt();

        int[] array = new int[n];

        System.out.print("Enter The array element : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        buyNsell(array, n);
        // System.out.println(Inversion(array));

        in.close();

    }

}
