 UC12
import java.util.*;

UC11
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 main

import java.util.*;
import java.util.stream.Collectors;
 main

public class TrainConsistManagementApp {

UC14

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {

UC12
    static class GoodsBogie {
 main
        String type;
        int capacity;


        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
 UC14


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

 main
        System.out.println("==========================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==========================================");
        System.out.println();

 UC14
        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());

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
 main
        }

        try {

            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + invalidBogie);
        } catch (InvalidCapacityException e) {

            System.out.println("Error: " + e.getMessage());
        }

 UC13
        System.out.println();
 UC14
        System.out.println("UC14 exception handling completed...");

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
                .map(b -> b.capacity)         
                .reduce(0, Integer::sum);      


        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
 main
 main
main
 main
    }
}