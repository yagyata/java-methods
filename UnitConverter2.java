import java.util.Scanner;

public class UnitConverter2 {
    // Conversion constants
    static double yardsToFeet = 3;
    static double feetToYards = 0.333333;
    static double metersToInches = 39.3701;
    static double inchesToMeters = 0.0254;
    static double inchesToCm = 2.54;

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * yardsToFeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * feetToYards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * metersToInches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * inchesToMeters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.print("Enter value in inches: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToCm(inches) + " cm");
    }
}
