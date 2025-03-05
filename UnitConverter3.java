import java.util.Scanner;

public class UnitConverter3 {
    // Conversion constants
    static double poundsToKilograms = 0.453592;
    static double kilogramsToPounds = 2.20462;
    static double gallonsToLiters = 3.78541;
    static double litersToGallons = 0.264172;

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " °F = " + convertFahrenheitToCelsius(fahrenheit) + " °C");

        System.out.print("Enter value in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " °C = " + convertCelsiusToFahrenheit(celsius) + " °F");

        System.out.print("Enter value in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");

        System.out.print("Enter value in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lbs");

        System.out.print("Enter value in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter value in liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
