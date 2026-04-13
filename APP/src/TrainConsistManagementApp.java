 UC12
import java.util.*;
import java.util.stream.Collectors;

UC11
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 main

import java.util.*;
import java.util.stream.Collectors;
 main

public class TrainConsistManagementApp {

UC12
    static class GoodsBogie {
        String type;
        String cargo;
        int capacity;

        GoodsBogie(String type, String cargo, int capacity) {
            this.type = type;
            this.cargo = cargo;
            this.capacity = capacity;
        }
    }

    public static List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {
        List<GoodsBogie> result = new ArrayList<>();
        for (GoodsBogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    public static List<GoodsBogie> filterUsingStream(List<GoodsBogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
UC11
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("=================================");
main

        System.out.println("==========================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==========================================");

 UC13

       
 main
        List<GoodsBogie> bogies = new ArrayList<>();
        Random random = new Random();

 UC13
        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie("Type", "Cargo", random.nextInt(100)));

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal")); 

        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
main
        }

        long startLoop = System.nanoTime();
        filterUsingLoop(bogies);
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        filterUsingStream(bogies);
        long endStream = System.nanoTime();

 UC13
        System.out.println();
        System.out.println("Loop Execution Time (ns): " + (endLoop - startLoop));
        System.out.println("Stream Execution Time (ns): " + (endStream - startStream));
        System.out.println();
        System.out.println("UC13 performance benchmarking completed...");

 UC12
        System.out.println("\nUC12 safety validation completed...");

        System.out.println("\nUC11 validation completed...");

        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);      // Sum all values


        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
 main
 main
main
    }
}