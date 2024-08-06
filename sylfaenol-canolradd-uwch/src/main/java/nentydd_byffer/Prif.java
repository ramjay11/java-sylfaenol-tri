package nentydd_byffer;

import java.util.ArrayList;
import java.util.List;

public class Prif {

    static List<Gweithiwr> gweithwyr = new ArrayList<>();

    static {
        gweithwyr.add(
                new Gweithiwr("Gweithiwr_1", "Mowk", 60000.0, List.of("Proj_1", "Proj_2"))
        );
        gweithwyr.add(
                new Gweithiwr("Gweithiwr_2", "Mowk", 70000.0, List.of("Proj_3", "Proj_4"))
        );
        gweithwyr.add(
                new Gweithiwr("Gweithiwr_3", "Mowk", 80000.0, List.of("Proj_5", "Proj_6"))
        );
        gweithwyr.add(
                new Gweithiwr("Gweithiwr_14", "Mowk", 90000.0, List.of("Proj_7", "Proj_8"))
        );
    }

    public static void main(String[] args) {
        // Print all gweithwyr
        //Stream.of(gweithwyr);
        // Stream object
        gweithwyr.stream()
                // forEach is a terminal operation and takes a Consumer
                .forEach(gweithiwr -> System.out.println(gweithiwr));
    }
}
