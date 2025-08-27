package Day8.multiThreadingMethods.priority;

class MyThread1 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) 
            Driver.print("MyThread1 with priority:" + Thread.currentThread().getPriority());         
    
    }


}

class MyThread2 implements Runnable {

    @Override
    public void run() {


        for (int i = 0; i < 10; i++) 
            Driver.print("MyThread2 with priority:" + Thread.currentThread().getPriority());

            
    }
}
