package innerClass;

public class StaticNestedClass {

    public static void main(String[] args) {

        OuterClass.InnerClass.display();
        
    }
    
}

class OuterClass{
//Only Inner classes can be static

    private static void outerMethod()
    {
        System.out.println("outerMethod");
    }
    static class InnerClass{
        public static void display()
        {
            System.out.println("inner class Method");
            outerMethod();
        }
    }

}
