import java.util.*;
import java.io.*;

public class negativeapositiveRearrange {
    static int reArrange(int a[], int n) {
        int pivot = -1, temp = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                pivot += 1;
                temp = a[pivot];
                a[pivot] = a[i];
                a[i] = temp;
            }

        }
        temp = 0;
        int neg = 0, pos = pivot + 1;
        while (neg < pos && pos < n && a[neg] < 0) {
            temp = a[neg];
            a[neg] = a[pos];
            a[pos] = a[neg];

            neg += 2;
            pos += 1;

        }
        // System.out.println(pivot);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
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
        reArrange(array, n);
        // System.out.println(Inversion(array));

        in.close();
    }

}
