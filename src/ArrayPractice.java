import java.util.Arrays;

public class ArrayPractice {
    /*
    This file is used to practice Java Array
    Arrays are used to store multiple values in a single variable, instead of decalring
    separate variable for each value
     */
    public static void main(String[] args) {

        //
        String[] cars = {"BMW", "Lexus", "Audi"};
        System.out.println(cars[0]);
        // .length property instead of length
        System.out.println("The length of the cars array is " + cars.length);


        // loop the array
        // loop the array through for-length pattern
        for (int i = 0; i < cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();
        // loop through for-each pattern
        for (String car: cars) {
            System.out.print(car+" ");
        }


        // I will use Arrays class and sort() static method to sort the array
        int[] integers = new int[]{100, 20, -10, -100, 110, 40};
        System.out.println("Before sorting :");
        for(int num: integers){
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(integers); // use static method
        System.out.println("After sorting :");
        for(int num: integers){
            System.out.print(num + " ");
        }

    }

}
