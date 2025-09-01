package Day8.multiThreadingMethods.join;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Mythread class");

    }

}
