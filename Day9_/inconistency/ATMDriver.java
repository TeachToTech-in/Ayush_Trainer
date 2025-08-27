package inconistency;
public class ATMDriver {
    public static void main(String[] args) throws InterruptedException  {
        Bank fatherAccount = new Bank();
        Bank sonAccount = new Bank();
        Bank daughterAccount = new Bank();

        fatherAccount.setName("father");
        sonAccount.setName("son");
        daughterAccount.setName("daughter");

        fatherAccount.getStatement();


        fatherAccount.start();
        sonAccount.start();
        daughterAccount.start();


        fatherAccount.join();
        sonAccount.join();
        daughterAccount.join();
        
        fatherAccount.getStatement();



    }
}
