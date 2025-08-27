package handeling;

public class HandledExceptionDriver {
     public static void main(String[] args) {

          String amount = "RS1000";
          int balance = 0 ;
          try{
           balance = Integer.parseInt(amount);
          }catch(ArithmeticException ex){
               System.out.println("we have an Airthmatic exception");
          }
          catch(NumberFormatException ex){
                   System.out.println("we have a Number format Exception");
          }catch(Exception ex){
                   System.out.println("we have a  Exception I do know which type at compile time");
          }

          System.out.println(balance);

     }
}