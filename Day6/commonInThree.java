import java.util.Scanner;

public class commonInThree {
    static int commonElements(int a1[], int n1, int a2[], int n2, int a3[], int n3) {

        // int counter = 0;
        int temp = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = i; j < n2; j++) {
                if (a1[i] == a2[j]) {
                    temp = a1[i];
                }
            }
            for (int j = i; j < n3; j++) {
                if (temp == a3[j]) {
                    System.out.println(a3[j]);
                    // return a3[j];
                }
            }
        }
        // System.out.println(counter);

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Enter the array size : ");
        n1 = in.nextInt();
        int[] array1 = new int[n1];
        System.out.print("Enter The array element : ");
        for (int i = 0; i < n1; i++) {
            array1[i] = in.nextInt();
        }

        System.out.println("Enter the array size : ");
        n2 = in.nextInt();
        int[] array2 = new int[n2];
        System.out.print("Enter The array element : ");
        for (int i = 0; i < n2; i++) {
            array2[i] = in.nextInt();
        }

        System.out.println("Enter the array size : ");
        n3 = in.nextInt();
        int[] array3 = new int[n3];
        System.out.print("Enter The array element : ");
        for (int i = 0; i < n3; i++) {
            array3[i] = in.nextInt();
        }
        commonElements(array1, n1, array2, n2, array3, n3);
        // System.out.println(commonElements(array1, n1, array2, n2, array3, n3));

        in.close();

    }

}
