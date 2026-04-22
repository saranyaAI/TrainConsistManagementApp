import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list (empty case)
        List<String> bogieIds = new ArrayList<>();

        // 🔴 Defensive check before search
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // 🔹 (Search logic - will not run if empty)
        String searchKey = "BG101";
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie not found.");
        }
    }
}