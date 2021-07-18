import java.util.Scanner;

public class minJumps {
    static int jumpCounter(int a[]) {
        int i = 0, c = 0;
        while (i < a.length) {
            if (a[i] == 0) {
                return -1;
            }
            int temp = a[i];
            i += temp;

            c++;
        }
        System.out.println(c + " ");
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
        jumpCounter(array);

        in.close();
    }

}
