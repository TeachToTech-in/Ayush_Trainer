package Day8.multiThreadingMethods.namingThread;

public class MyThread implements Runnable {

    @Override
    public void run() {

        System.out.println("In run method state:" + Thread.currentThread().getState());

    }

}
