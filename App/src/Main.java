import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    // Inner Bogie class
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
        System.out.println("   UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // ---- Before Sorting ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- Sorting using Comparator ----
        Collections.sort(bogies, new Comparator<Bogie>() {
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity; // ascending order
            }
        });

        // ---- After Sorting ----
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}