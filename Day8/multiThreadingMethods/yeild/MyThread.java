package Day8.multiThreadingMethods.yeild;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++)
            System.out.println("Mythread class");
        Thread.yield();

        //Since always it is calling yeild method it means it will always give chance to other threds first i.e main thread here

    }

}
