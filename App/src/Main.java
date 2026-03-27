import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC11 - Validate Train ID and Cargo Code    ");
        System.out.println("==============================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX PATTERNS ----
        String trainIdRegex = "TRN-\\d{4}";     // TRN-1234
        String cargoCodeRegex = "[A-Z]{3}-[A-Z]{2}"; // PET-AB

        // ---- VALIDATE USING PATTERN ----
        boolean isTrainValid = Pattern.matches(trainIdRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoCodeRegex, cargoCode);

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}