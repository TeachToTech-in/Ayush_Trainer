package Day8.multiThreadingMethods.namingThread;

public class Driver {
    public static void main(String[] args) {
        Runnable t =new MyThread();
        Thread t1 = new Thread(t);
        print("before start state:"+t1.getState());
        t1.start();
        print("after start state:"+t1.getState());

        print("My Thread class thread name is"+t1.getName());
        t1.setName("MyRunnable Thread");
        print("renamed the thread to "+t1.getName());

        
        print("current thread priority "+ t1.getPriority());

        print("end thread job status "+t1.getState());

    }








    //creating my own print method for cleaner code
    //this is just a example one should do for leangthy codes
    //seperate them in methods
    private static void print(String msg){
        System.out.println(msg);
    }
}
