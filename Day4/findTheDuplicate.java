import java.util.Scanner;

public class findTheDuplicate {
    static int duplicate(int a[]) {
        int n = a.length;
        // int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        // System.out.println(a[i]);
                        return a[i];
                    }
                    // else
                    // temp[i] = a[i];

                }
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
        // duplicate(array);
        System.out.println(duplicate(array));

        in.close();

    }

}
