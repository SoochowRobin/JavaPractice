public class FinalizePractice {
    /*
     * finalize method is a method in Object class, it will call when the object will be gathered by GC.
     */

    public static void main(String[] args) {
//        for (int i = 0; i < 10000000; i++) {
//            FinalizePractice p = new FinalizePractice();
//            p = null;
//        }

        // you could use System.gc() to suggest turn on gc
        for (int i = 0; i < 50; i++) {
            FinalizePractice p = new FinalizePractice();
            p = null;
            System.gc();
        }
    }

    // this will print when the object will be collected by GC.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("This will be collected by GC!");
    }
}
