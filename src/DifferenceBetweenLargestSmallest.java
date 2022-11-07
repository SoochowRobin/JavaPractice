import java.util.Scanner;

public class DifferenceBetweenLargestSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers are you intend to enter? ");
        int n = scanner.nextInt();

        // create integer array
        int[] array = new int[n];
        System.out.println("Please enter your integers");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // loop array and find largest and smallest
        int largest = array[0];
        int smallest = array[0];

        // use enhanced for loop looks very clear
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The difference between largest " + largest + " and smallest " + smallest + " is " + (largest - smallest));



    }
}
