package thread;
/*
     how to implement one thread?
        write a class and this class extends Thread, and override run() method.
 */
public class ThreadPractice02 {

    public static void main(String[] args) {
        // here is the main thread
        MyThread myThread = new MyThread();

        // the purpose of the start is to allocate a new stack in memory for this thread
        myThread.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Main stack --> " + i);
        }

    }
}


class MyThread extends Thread{

    //This code will run in branch stack(分支栈)
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("branch stack thread --> " + i);
        }
    }
}