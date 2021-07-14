import java.util.Scanner;

public class reverseTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n;
        System.out.println("Enter the array string : ");
        String array1 = in.nextLine();

        char[] array = array1.toCharArray();

        // reverse
        char temp = 0;
        int j = array1.length() - 1;
        for (int i = 0; i < array1.length() / 2; i++) {

            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j = j - 1;ss

        }
        temp = 0;

        for (int k = 0; k < array1.length(); k++) {
            System.out.print(array[k]);

        }

        in.close();
    }

}
