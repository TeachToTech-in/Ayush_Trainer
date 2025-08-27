package tryCatch;

public class ExceptionDriver{
public static void main(String[] args) {
     //This line will be printed
    System.out.println("Inside the main method");
    int a =10;
    int b = 0;
    int value =0;
    try{
         value = a/b;
    }catch(ArithmeticException ex){
         System.out.println(" catch block executed");
    }

    System.out.println("value1:"+value);

    a= 10;
    b=10;

    try{
         value = a/b;
    }catch(ArithmeticException ex){
         System.out.println(" catch block not executed");
    }

    System.out.println("value2:"+value);

}
}