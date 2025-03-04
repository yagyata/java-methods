import java.util.Scanner;

public class DivideChocolates {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Chocolates each child gets
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remaining chocolates
        return new int[]{chocolatesPerChild, remainingChocolates}; // Returning both in an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Handling division by zero case
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        }
	else {
            // Finding chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying the results
            System.out.println("Each child gets: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

    }
}
