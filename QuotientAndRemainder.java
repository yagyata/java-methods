import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Division operator for quotient
        int remainder = number % divisor; // Modulus operator for remainder
        return new int[]{quotient, remainder}; // Returning both in an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the dividend: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Handling division by zero case
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        }
	else {
            // Finding quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

    }
}
