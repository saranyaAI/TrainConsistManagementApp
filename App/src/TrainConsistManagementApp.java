public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // 🔹 Bubble Sort Algorithm
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\nSorted Passenger Bogie Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}