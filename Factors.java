import java.util.Scanner;

public class Factors {

	//Method to find factors and return them in an array
	public static int[] findFactors(int number) {
		int count = 0;

		//First loop to count the numbers of factors
		for (int i = 1; i <= number; i++) {
			if (number % i ==0) {
				count++;
			}
		}
		//Initialize the array with the counted size
		int[] factors = new int[count];
		int index = 0;

		//Second loop to store factors in the array
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index++] = i;
			}
		}

		return factors;

	}

	//Method to calculate the sum of factors
	public static int sumOfFactors(int[] factors) {
		int sum = 0;
		for(int factor : factors) {
			sum += factor;
		}
		return sum;
	}

	//Method to calculate the product of factors
	public static long productOfFactors(int[] factors) {
		long product = 1;
		for(int factor : factors) {
			product *= factor;
		}
		return product;
	}

	//Method to calculate the sum of square of factors
	public static int sumOfSquaresOfFactors(int[] factors) {
		int sum = 0;
		for(int factor : factors) {
			sum += Math.pow(factor, 2);
		}
		return sum;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display sum, product, and sum of squares
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));

    }



}

