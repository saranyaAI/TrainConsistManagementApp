import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // 🔹 Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}