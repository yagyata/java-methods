import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||  // March 20 onwards
            (month == 4) ||               // April (full month)
            (month == 5) ||               // May (full month)
            (month == 6 && day <= 20)) {  // Until June 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Checking if it's Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        scanner.close();
    }
}
