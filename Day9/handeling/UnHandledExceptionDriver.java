package handeling;

public class UnHandledExceptionDriver {
     public static void main(String[] args) {

          String amount = "RS1000";
          int balance = 0 ;
          try{
           balance = Integer.parseInt(amount);
          }catch(ArithmeticException ex){
               //instead of NumberFormatException we have given Airtmatic exception
               //it means it is not handled
          }

          System.out.println(balance);

     }
}