import java.util.Scanner;

public class AreaOfCircle {

    /*
    review use Math library and use static method round() to get an integer result after calculation
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        System.out.println("The area of the circle is " + Math.round(radius * radius * 3.1415));
    }
}
