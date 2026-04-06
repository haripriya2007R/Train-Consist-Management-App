import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=================================");

        Map<String, Integer> bogieCapacity = new HashMap<>();


        bogieCapacity.put("Engine", 0);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("Cargo", 100);
        bogieCapacity.put("Guard", 2);

        System.out.println("\nBogie Capacity Details:");


        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping complete.");
    }
}