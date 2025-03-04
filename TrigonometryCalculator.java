import java.util.Scanner;

public class TrigonometryCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate trigonometric values
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sin(%.2f°) = %.5f%n", angle, results[0]);
        System.out.printf("Cos(%.2f°) = %.5f%n", angle, results[1]);
        System.out.printf("Tan(%.2f°) = %.5f%n", angle, results[2]);

        scanner.close();
    }
}

