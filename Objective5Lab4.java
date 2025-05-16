import java.util.Scanner;  // Import the Scanner class

public class Objective5Lab4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Please enter a number: ");

        // Take the number input from the user
        int num = scanner.nextInt();

        // Check if the number is even or odd using the modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}
