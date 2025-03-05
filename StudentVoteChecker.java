import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
	StudentVoteChecker checker = new StudentVoteChecker(); // Create an instance

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            }
	    else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is not eligible to vote.");
            }
        }

    }
}

