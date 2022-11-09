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
    }

}
