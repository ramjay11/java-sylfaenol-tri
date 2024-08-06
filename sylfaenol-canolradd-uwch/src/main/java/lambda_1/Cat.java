package lambda_1;

public class Cat implements Printable {
    public String name;
    public String gender;

    public Cat() {
    }

    @Override
    public String print(String suffix) {
        return suffix;
    }

//    @Override
//    public void print() {
//        System.out.println("Meow");
//    }
}
