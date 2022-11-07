import java.util.Scanner;

public class AddTwoNumbersByUserInput {
    /*
    get user input and print the sum of two numbers

    import Scanner from util library
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your first number is: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Your second number is: ");
        int secondNumber = scanner.nextInt();
        System.out.print("The sum of two integer is: ");
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
}
