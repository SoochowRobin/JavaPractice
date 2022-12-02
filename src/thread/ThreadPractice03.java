package thread;

public class ThreadPractice03 {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);  // encapsulate myRunnable into Thread object
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("main branch -> " + i);
        }

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("branch stack -> " + i);
        }
    }
}

