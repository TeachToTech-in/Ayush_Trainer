package Day8.multiThreadingMethods.join;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Runnable t = new MyThread();
        Thread t1 = new Thread(t);

        t1.start();
        t1.join(5000);
        for (int i = 0; i < 10; i++)
            System.out.println("Main class");

    }

}
