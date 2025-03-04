import java.util.Scanner;

public class TriangleParkRun {

    // Method to calculate the number of rounds required to complete a 5km run
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter); // 5000 meters = 5 km
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the sides of the triangular park
        System.out.print("Enter first side of the park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter second side of the park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter third side of the park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculating required rounds
        int rounds = calculateRounds(side1, side2, side3);

        // Displaying result
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

    }
}
