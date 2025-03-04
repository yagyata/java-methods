import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive number
        }
	else if (num < 0) {
            return -1; // Negative number
        }
	else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling the method and storing the result
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        }
	else if (result == -1) {
            System.out.println("The number is Negative.");
        }
	else {
            System.out.println("The number is Zero.");
        }

    }
}
