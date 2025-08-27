package synchronisation;
public class Bank extends Thread {

    private  static  int amount = 1_00_000;

    public synchronized  void run() {
    

            for (int i = 0; i < 5; i++) {
                debit(1000);
        }

    }

    public synchronized  void debit(int debitAmount) {
        amount = amount - debitAmount;
                System.out.println(debitAmount+" DEBITED BY "+Thread.currentThread().getName());
        //getStatement();
    }

    public synchronized  void  credit(int creditAmount) {
        amount = amount + creditAmount;
                System.out.println(creditAmount+" CREDITED BY "+Thread.currentThread().getName());
       // getStatement();
    }

    public static  void getStatement() {
        System.out.println(Thread.currentThread().getName()+" balance:" + amount);
    }

}