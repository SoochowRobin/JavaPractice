package thread;

public class ThreadPractice01 {

    // try to tell how many threads in this program?
    // there is 1 thread in this program

    public static void main(String[] args) {

        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {

        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 over");
    }


}
