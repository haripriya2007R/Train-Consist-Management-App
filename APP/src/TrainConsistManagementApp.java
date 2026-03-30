import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("=================================");

        LinkedList<String> bogies = new LinkedList<>();

        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("AC");
        bogies.add("Cargo");
        bogies.add("Guard");

        System.out.println("\nInitial Train Consist:");
        printWithBraces(bogies);

        bogies.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        printWithBraces(bogies);

        // Remove first and last bogie
        bogies.removeFirst();
        bogies.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        printWithBraces(bogies);

        System.out.println("\nUC4 ordered consist maintenance completed.");
    }

    public static void printWithBraces(LinkedList<String> list) {
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1)
                System.out.print(", ");
        }
        System.out.println(" }");
    }
}