import java.util.Scanner;

public class SumNaturalNumbers {
    // Recursive method to find the sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula-based method to find the sum of first n natural numbers
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations match, The result is " + formulaSum);
        }
	else {
            System.out.println("There is a mismatch. Check the calculations.");
        }

    }
}
