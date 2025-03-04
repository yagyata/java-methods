import java.util.Scanner;

public class HandShakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Calculating maximum handshakes
        int maxHandshakes = calculateHandshakes(n);

        // Displaying result
        System.out.println("The maximum number of handshakes among " + n + " students is " + maxHandshakes);

    }
}
