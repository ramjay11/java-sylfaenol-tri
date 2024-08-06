package Collections;

import java.util.ArrayList;

public class Prif {
    public static void main(String[] args) {
        ArrayList<String> enwau = new ArrayList<>();
        enwau.add("name1");
        enwau.add("name2");
        enwau.add("name3");
        enwau.remove("name2");
        enwau.remove(1);
        if (enwau.contains("name1")) {
            System.out.println("name1 is in the list");
        }
    }
}
