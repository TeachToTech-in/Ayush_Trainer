public class OuterClass {

    public class InnerClass{
        void print() {
            System.out.println("Hello from Inner Class!");
        }
    }
}


class Driver{
    public static void main(String[] args) {
            OuterClass outer = new OuterClass();

        // Create InnerClass object using OuterClass
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.print();
    }
}
