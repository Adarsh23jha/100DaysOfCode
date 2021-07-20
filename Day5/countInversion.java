import java.util.Scanner;

public class countInversion {
    static int Inversion(int a[]) {
        int counter = 0;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[j] < a[i]) {
                    counter++;

                }
            }
        }
        System.out.println(counter);
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
        Inversion(array);
        // System.out.println(Inversion(array));

        in.close();
    }
}
