import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=================================");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("\nFinal Train Formation:");
        printWithBraces(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup complete.");
    }

    public static void printWithBraces(Set<String> set) {
        System.out.print("{ ");

        int count = 0;
        int size = set.size();

        for (String b : set) {
            System.out.print(b);
            count++;
            if (count < size)
                System.out.print(", ");
        }

        System.out.println(" }");
    }
}