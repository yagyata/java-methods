import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed: ");
        double windSpeed = scanner.nextDouble();

	// Call the method
	double windChill = calculateWindChill(temperature, windSpeed);

	// Display the results
	System.out.println("The wind chill temperature is: " + windChill + "°F");

    }
}
