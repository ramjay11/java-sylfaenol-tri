package functionalinterface_1;

@FunctionalInterface
interface A {
    void show();
    String toString();
}

//class B extends Object implements A {
//    @Override
//    public void show() {
//
//    }
//}

public class funcinterface_a {
    public static void main(String[] args) {
        /*
        A obj = new A() {
            // Anonymous/inner class
            public void show() {
                System.out.println("Hi inner");
            }
        };
        */
        A obj = () -> System.out.println("Hi inner");
        obj.show();
    }
}
