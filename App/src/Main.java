import java.util.HashSet;
import java.util.Set;

public class Main{

    public static void main(String[] args) {

        // Display Header
        System.out.println("=====================================");
        System.out.println("   UC3 - Track Unique Bogie IDs      ");
        System.out.println("=====================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display results
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note message
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}