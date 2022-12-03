package thread;

public class ThreadPractice04 {

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("ttt");
        t.start();

        try {
            Thread.sleep(1000 * 5); // main thread sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-----> begin");

        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "-----> end");
    }
}

