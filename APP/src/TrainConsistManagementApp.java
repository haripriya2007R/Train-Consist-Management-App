 UC20

UC19
import java.util.Arrays;


 UC18

 UC17
import java.util.Arrays;

 UC15
 main
 main
 main
 main
public class TrainConsistManagementApp {

UC16
    public static void main(String[] args) {

 UC20
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("--------------------------------------------------");

 UC19
        System.out.println("======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("======================================\n");

        System.out.println("==========================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("==========================================\n");

UC18
 main
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};


        Arrays.sort(bogieIds);
 main

        String[] bogieIds = {};   // Change this to test other cases

        String searchId = "BG101";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

 UC20

 UC19
        System.out.println();

        int low = 0;
        int high = bogieIds.length - 1;

 UC17
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
 main

 main
main
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchId + " found in train.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found in train.");
        }

 UC20
        System.out.println("\nUC20 execution completed...");

 UC19
        System.out.println("\nUC19 search completed...");

 UC18
        System.out.println("\nUC18 search completed...");

        System.out.println("\nUC17 sorting completed...");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");

 
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {

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
main
            super(message);
        }
    }

UC15
    
    static class GoodsBogie {
        String shape;
        String cargo;

    static class PassengerBogie {

UC12
    static class GoodsBogie {
 main
        String type;
        int capacity;

 main

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
               
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

              
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {
 UC15

        System.out.println("==========================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("==========================================\n");

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
main

       
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        System.out.println();

        
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

UC15
        System.out.println("\nUC15 runtime handling completed...");

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
 main
 main
 main
 main
 main
 main
    }
}