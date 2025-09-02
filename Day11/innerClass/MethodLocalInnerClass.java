package innerClass;

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        OuterClass out =new OuterClass();
        out.calculate();
    }
}

class OuterClass{
    private int x=10;
    private int y=15;
    public void calculate(){
        
        class InnerClass{
            public void display(){
                System.out.println(x+y);
            }
        }

        InnerClass in = new InnerClass();
        in.display();

    }
}
