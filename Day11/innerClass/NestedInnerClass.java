package innerClass;

public class NestedInnerClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass1 inner1 = outer.new InnerClass1();
        OuterClass.InnerClass1.InnerClass2 inner2 = inner1.new InnerClass2();

        inner2.print();

    }
}

class OuterClass {

    class InnerClass1 {

        class InnerClass2 {

            void print() {
                System.out.println("Hello from Inner Class 2!");
            }
        }
    }

}
