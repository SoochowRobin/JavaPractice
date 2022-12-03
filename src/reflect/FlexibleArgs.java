package reflect;

public class FlexibleArgs {

    public static void main(String[] args) {

        m();
        m(1);
        m(2, 4, 5, 8);
    }


    private static void m(int... args){
        System.out.println("flexible method execute!");

        for (Integer arg: args) {
            System.out.println(arg);
        }
    }

}
