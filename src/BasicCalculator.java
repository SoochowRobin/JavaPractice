import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter your second number: ");
        float secondNumber = scanner.nextFloat();

        System.out.println("Please read this ");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for divide");

        /*
         * review how to use if-else condition statement
         */

        int option = scanner.nextInt();
        if (option == 1){
            System.out.println("addition : " + (firstNumber + secondNumber));
        }else if(option == 2){
            System.out.println("subtraction : " + (firstNumber - secondNumber));
        }else if (option == 3){
            System.out.println("multiplication : " + (firstNumber * secondNumber));
        }else if (option == 4){
            System.out.println("divide : " + (firstNumber / secondNumber));
        }else{
            System.out.println("Warning!! Please enter the appropriate number!");
        }


    }
}
