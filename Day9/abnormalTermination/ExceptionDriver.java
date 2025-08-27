package abnormalTermination;

public class ExceptionDriver{
public static void main(String[] args) {
     //This line will be printed
    System.out.println("Inside the main method");
    int a =10;
    int b = 0;

    int value = a/b;

    //This line will not get printed
    System.out.println(value);
}
}