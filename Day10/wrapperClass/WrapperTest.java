package wrapperClass;

public class WrapperTest {
    public static void main(String[] args) {
        int i =10;
            System.out.println("primitive int "+i);
        Integer a =new Integer(i);//Boxing
        Integer b = Integer.valueOf(10);//
        Integer c =10;//Auto Boxing
            System.out.println("Object int "+a);
            System.out.println("Object int value of "+b);

           int d=  b.intValue();//unboxing

           int e=  a;  //Auto Unboxing
    }
}
