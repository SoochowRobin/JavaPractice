import java.util.Scanner;

public class CountEvenOddinInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int n = scanner.nextInt();
        // convert integer to string
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];
        int countOdd = 0;
        int countEven = 0;

        // use this method to get each digit
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0'; //
        }

        for (int i = 0; i < temp.length(); i++) {
            if (arr[i] % 2 == 0){
                countEven ++;
            }else if(arr[i] % 2 != 0){
                countOdd ++;
            }
        }

        System.out.println("Even --> "+ countEven);
        System.out.println("Odd --> " + countOdd);
        scanner.close();
    }
}
