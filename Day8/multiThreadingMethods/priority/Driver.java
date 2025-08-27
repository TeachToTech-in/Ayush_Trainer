package Day8.multiThreadingMethods.priority;

public class Driver {
    public static void main(String[] args) {
        Runnable target1 =new MyThread1();
        Runnable target2 =new MyThread2();

          Thread t1 = new Thread(target1);
          Thread t2 = new Thread(target2);


        t1.setPriority(10);
        t2.setPriority(5);

        t1.start();
        t2.start();


//On calling start(), each thread runs concurrently; higher priority may get preference, but actual order may depends on the OS thread scheduler.

//Note: Sometimes, thread priorities have minimal effect on the scheduler in different systems. To enforce strict priority-based scheduling in HotSpot JVM, we can set the system-level flag -XX:ThreadPriorityPolicy=1.



    }








    //creating my own print method for cleaner code
    //this is just a example one should do for leangthy codes
    //seperate them in methods
    public static void print(String msg){
        System.out.println(msg);
    }
}
