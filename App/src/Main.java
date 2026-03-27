import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Display Header
        System.out.println("===========================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("===========================================\n");

        // LinkedHashSet preserves order and avoids duplicates
        Set<String> formation = new LinkedHashSet<>();

        // ---- Add bogies (including duplicates) ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate entries (ignored automatically)
        formation.add("Sleeper");
        formation.add("Engine");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        // Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}