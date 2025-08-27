package Day8.multiThreading;

import Day8.multiThreading.RunnableInterface.MyRunnable;
import Day8.multiThreading.threadClass.MyThread;

public class ThreadDriver {
    public static void main(String[] args) {
        //only Main thread is present here
        System.out.println("Here only we have "+ Thread.currentThread().getName()+" thread");
        //creating Thread using Thread class

        Thread t1 = new MyThread();//thread t1 in new or Born state
        t1.start();//thread created initialised by start and assigned to Thread scheduler for execution

        //Now we have two threads one is main and other is Thread-0

        //Creating thread using class implenting Runnable 
        Runnable targetRunable = new MyRunnable();
        Thread t2 = new Thread(targetRunable);
        t2.start();

        //Now we have 3 threads

    }

    
}
