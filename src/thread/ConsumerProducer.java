package thread;

import java.util.ArrayList;
import java.util.List;

/*
use wait and notify method to implement consumer and producer pattern

list as table and it could only store one item
 */
public class ConsumerProducer {

    public static void main(String[] args) {

        List list = new ArrayList<>(); //sharable list
        Thread t1 = new Thread(new Consumer(list));
        Thread t2 = new Thread(new Producer(list));

        t1.setName("Consumer");
        t2.setName("Producer");

        t1.start();
        t2.start();



    }
}

class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){
                if(list.size() > 0){
                    try {
                        list.wait();  // this thread will wait and release lock
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // code can reach here, so we could produce
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"--->" + obj);
                list.notify();
            }

        }
    }
}


class Consumer implements Runnable{

    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){
                if(list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "----->" + obj);
                list.notify();
            }


        }
    }
}