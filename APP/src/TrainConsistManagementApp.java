import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=================================");

        Set<String> bogies = new LinkedHashSet<>();

        bogies.add("B101");
        bogies.add("B102");
        bogies.add("B101");

        System.out.println("\nBogies ID After Insertion:");
        for (String id : bogies) {
            System.out.print(id + " ");
        }


        System.out.println("\n\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed.");
    }
}