package Day8.multiThreading.threadClass;

public class MyThread extends Thread{
    //By default Thread class run method is blank
    //If yo do not override run method of Thread class but you extend it then no error/nothing will happen
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("My Thread class executed by "+ Thread.currentThread().getName());
        }
    } 
}
