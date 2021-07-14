import java.util.Scanner;

public class KthSmallestElement {

    static int smallestElement(int array[], int k) {
        int y = 1, temp = 0;
        while (y <= k) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

            y += 1;

        }
        System.out.println(array[k - 1]);

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the array size : ");
        n = in.nextInt();

        System.out.println("Enter the K'th : ");
        int k = in.nextInt();

        int[] array = new int[n];

        System.out.print("Enter The array element : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        smallestElement(array, k);
        in.close();
    }

}
