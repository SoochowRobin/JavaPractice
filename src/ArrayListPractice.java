import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    /*
    ArrayList is from java.util package and it is a resizable array
    some common operation on ArrayList is .add(), .get(), .set(index, newValue), .remove(index)
    clear(), .size()
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Audi");
        // change one value
        cars.set(2, "Audi1");
        System.out.println("Check the size() method of ArrayList " + cars.size());

        System.out.println("check get() method of the ArrayList " + cars.get(2));

        // use size method to loop the ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
        for (String car: cars) {
            System.out.println(car);
        }


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(40);
        integerArrayList.add(-10);
        integerArrayList.add(12);
        // loop through the arraylist
        for (int num: integerArrayList){
            System.out.println(num);
        }

        Collections.sort(integerArrayList);
        // after sort()
        System.out.println("after sort: ");
        // loop through the arraylist
        for (int num: integerArrayList){
            System.out.println(num);
        }


    }
}
