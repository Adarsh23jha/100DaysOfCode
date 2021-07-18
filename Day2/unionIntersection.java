import java.util.Scanner;

public class unionIntersection {
    // static int union() {

    // return 0;
    // }

    static int merge(int a[], int b[]) {
        int i, m;
        m = a.length + b.length;
        int[] c = new int[m];
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (; i >= 0; i--) {
            c[i] = b[i];
        }

        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;

        System.out.println("Enter the array size : ");
        n = in.nextInt();

        int[] a = new int[n];

        System.out.print("Enter The array element of a : ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Enter the array size : ");
        m = in.nextInt();

        int[] b = new int[m];

        System.out.print("Enter The array element of b : ");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        // System.out.println(union(n, a, m, b));
        merge(a, b);

        in.close();
    }

}
