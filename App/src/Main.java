import java.util.ArrayList;
import java.util.List;

public class Main {

    // Reusing Bogie model (same as UC7, UC8, UC9)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // Display Header
        System.out.println("==========================================");
        System.out.println("   UC10 - Count Total Seats in Train      ");
        System.out.println("==========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // ---- Display bogies ----
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- AGGREGATE USING STREAM REDUCE ----
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, (sum, cap) -> sum + cap); // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}