import java.util.Scanner;

public class FactorOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your potential number: ");
        int n = scanner.nextInt();

        // use StringBuilder to edit string easily
        StringBuilder result = new StringBuilder(n + " has factor: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                result.append(i);
                result.append(' ');
            }
        }

        // print result directly, do not need toString call here
        System.out.println(result);
    }
}
