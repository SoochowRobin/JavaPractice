public class ObjectPractice {
    public static void main(String[] args) {
        /*
        call this method in main method
         */
        System.out.println(" Override toString method in  " + new ObjectPractice());
    }

    @Override
    public String toString() {
        /*
        getClass() method is a method in Object class defined as final,
        so you could not override it. you could just call it.
         */
        return getClass().getName();
    }
}
