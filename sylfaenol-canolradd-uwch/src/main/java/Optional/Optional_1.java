package Optional;

import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
        /*
        * Optional.of = It will throw NPE (NullPointerException)
        * Optional.ofNullable = It will not throw NPE (NullPointerException)
        * */
        String name = "Java";
        //String name = null;
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName.get());

        String address = null;
        Optional<String> optionalAddress = Optional.ofNullable(address);
        System.out.println(optionalAddress.isEmpty());
    }
}
