import java.util.Scanner;

public class longestArithmeticSubarray {
    static int calculate(int a[], int k) {

        int temp[] = new int[k];
        int n = k - 1, counter = 0, max = Integer.MIN_VALUE;
        for (int i = n; i > 0; i--) {
            int diff = a[i - 1] - a[i];
            temp[i] = diff;
        }
        for (int i = n; i > 0; i--) {

            if (temp[i - 1] == temp[i]) {

                counter = counter + 1;

                max = Math.max(max, counter);
                break;

            } else {
                counter = 0;
            }

        }

        int v = max + 2;

        return v;
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
        // calculate(array, n);
        System.out.println(calculate(array, n));

        in.close();

    }

}
