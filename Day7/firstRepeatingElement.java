import java.util.Scanner;
import java.util.HashSet;

public class firstRepeatingElement {
    static int repeatingElement(int a[], int n) {
        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (hs.contains(a[i])) {
                temp = i;
            } else {
                hs.add(a[i]);
            }
        }
        if (temp != -1) {
            System.out.println(temp + 1);
        } else
            System.out.println("-1");

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
        repeatingElement(array, n);
        // System.out.println(Inversion(array));

        in.close();

    }

}
