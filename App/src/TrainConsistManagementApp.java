import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index 1-based → position 2 = index 1)
        trainConsist.add(1, "Pantry Car");

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}