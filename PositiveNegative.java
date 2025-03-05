import java.util.Scanner;

public class PositiveNegative {

	//Method to check if a number is Positive
	public static boolean isPositive(int number) {
		return number >= 0;
	}

	//Method to check if a number is Even
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	//Method to comapare two numbers
	public static int compare(int num1, int num2) {
		if (num1 > num2) {
			return 1;
		} else if (num2 > num1) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];

		System.out.print("Enter the numbers: ");
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int num : numbers) {
			if (isPositive(num)) {
				System.out.print("The number " + num + " is Positive and ");
				if (isEven(num)) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
			} else {
				System.out.println("The number " + num + " is Negative");
			}
		}

		// Comparing first and last element
        	int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
	        if (comparisonResult == 1) {
        	System.out.println("First number is greater than the last number");
	        } else if (comparisonResult == 0) {
	            System.out.println("First and last number are equal");
        	} else {
	            System.out.println("First number is less than the last number");
        	}

	}

}
