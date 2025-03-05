import java.util.Scanner;

public class LeapYearChecker {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("The LeapYear program only works for years >= 1582.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input! The program only works for years >= 1582.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        }
	else {
            System.out.println(year + " is NOT a Leap Year.");
        }

    }
}
