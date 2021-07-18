import java.util.Scanner;

public class Sort012 {
    static int sort012(int a[], int n) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            else if (a[i] == 1)
                c1++;
            else
                c2++;
        }
        int k = 0;
        for (int i = 0; i < c0; i++)
            a[k++] = 0;
        for (int i = 0; i < c1; i++)
            a[k++] = 1;
        for (int i = 0; i < c2; i++)
            a[k++] = 2;

        for (int j = 0; j < n; j++) {
            System.out.print(a[j]);
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
        sort012(array, n);

        in.close();

    }
}
