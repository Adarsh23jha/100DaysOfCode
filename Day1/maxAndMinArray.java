import java.util.Scanner;

public class maxAndMinArray {
    static int MaxMin(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            min = Math.min(array[i], array[i + 1]);
            max = Math.max(array[i], array[i + 1]);
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

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

        MaxMin(array);
        in.close();
    }

}
