import java.util.Scanner;

public class SumSubArray {
    static int fun(int a[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;

            }
            if (sum < 0) {
                sum = 0;

            }

        }
        System.out.println(max);

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
        // System.out.println();
        fun(array);

        in.close();

    }

}
