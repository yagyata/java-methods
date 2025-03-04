import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to find the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Adding each number from 1 to n
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calling the method and displaying the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        sc.close();
    }
}
