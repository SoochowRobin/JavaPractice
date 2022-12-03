package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallablePractice {



    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {  // it is very similar to run method, but it has return value
                System.out.println("Thread begin!");
                Thread.sleep(1000);
                System.out.println("Thread ends!");
                return 100 + 200;
            }
        });


        Thread t = new Thread(task);
        t.start();
        int a = (int)task.get();
        System.out.println(a);

    }

}
