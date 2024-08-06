package lambda_1;

public class Main {
    public static void main(String[] args) {
        //var cat = new Cat();
        //cat.print();
        //printThing(cat);
        /*
        Passing a method implementation without lambda
        printThing(
                public void print() {
            System.out.println("Meow");
            }
        );
        */
        //Printable lambdaPrintable = () -> System.out.println("Meow");
        //printThing(() -> System.out.println("Meow"));
        /*
        Printable lambdaPrintable = s -> {
            System.out.println("Meow" + s);
            return "Meow";
        };
        */
        Printable lambdaPrintable = (s) -> "Meow" + s;
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
