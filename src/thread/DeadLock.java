package thread;

public class DeadLock {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();


        Thread t1 = new MyThread1(o1, o2);
        Thread t2 = new MyThread2(o1, o2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }






}

class MyThread1 extends Thread{
    Object obj1;
    Object obj2;

    public MyThread1(Object obj1, Object obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj2){

            }
        }
    }
}


class MyThread2 extends Thread{
    Object obj1;
    Object obj2;

    public MyThread2(Object obj1, Object obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj1){

            }
        }
    }
}

