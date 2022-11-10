public class FibPractice {

    public static void main(String[] args) {
        int time = 10;
        int firstItem = 0;
        int secondItem = 1;
        System.out.println("Print Fib " + time + " times!");
//        for (int i = 0; i < time; i++){
//            System.out.print(firstItem + " ");
//
//            int nextItem = firstItem + secondItem;
//            firstItem = secondItem;
//            secondItem = nextItem;
//        }

        // use while loop
        int i = 1;
        while (i < time){
            System.out.print(firstItem + " ");

            int nextItem = firstItem + secondItem;
            firstItem = secondItem;
            secondItem = nextItem;
            i++;
        }
    }


}
