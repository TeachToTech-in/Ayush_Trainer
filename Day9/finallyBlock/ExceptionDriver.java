package finallyBlock;

public class ExceptionDriver{
public static void main(String[] args) {
     int a= 10;
     int b =0;
     int value = 0;
    try{
     value = a/b;
    }
    catch(NumberFormatException ex){
         System.out.println(" catch block not executed");
    }
    finally
    {
          System.out.println("Always Executed ");
    }

   
System.out.println("End of program ");
}
}