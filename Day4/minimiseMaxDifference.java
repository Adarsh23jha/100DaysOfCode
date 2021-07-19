import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class minimiseMaxDifference {
    static int getmindiff(Integer arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((arr[i] - k) <= 0) {
                arr[i] += k;
            } else
                arr[i] -= k;
        }
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        // System.out.println(min);
        // System.out.println(max);

        int diff = max - min;

        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the array size : ");
        n = in.nextInt();

        Integer[] array = new Integer[n];
        System.out.print("Enter The K element : ");
        int k = in.nextInt();

        System.out.print("Enter The array element : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        // duplicate(array);
        System.out.println(getmindiff(array, k));

        in.close();

    }

}
