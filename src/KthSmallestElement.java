import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you intend to enter: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // use built-in sort algorithm
        Arrays.sort(array);

        System.out.println("How many numbers are you intend to see? ");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }


}
