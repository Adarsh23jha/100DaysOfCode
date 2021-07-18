import java.util.Scanner;

public class rotateCyclically {

    static int rotate(int array[]) {
        int temp = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = temp;
        for (int k = 0; k <= array.length - 1; k++) {
            System.out.print(array[k] + " ");
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
        rotate(array);
        in.close();

    }

}
