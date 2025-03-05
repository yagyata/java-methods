import java.util.Scanner;

public class YoungestAndTallest {
    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Finding youngest and tallest friend
        String youngestFriend = findYoungest(friends, ages);
        String tallestFriend = findTallest(friends, heights);

        // Displaying results
        System.out.println("\nYoungest friend: " + youngestFriend);
        System.out.println("Tallest friend: " + tallestFriend);

    }
}
