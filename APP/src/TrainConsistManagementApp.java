public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("--------------------------------------------------");

        String[] bogieIds = {};   // Change this to test other cases

        String searchId = "BG101";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

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

        System.out.println("\nUC20 execution completed...");
    }
}