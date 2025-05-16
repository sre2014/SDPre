import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    // Your solution goes here
    age = input.nextInt(); // Get user's age
    currentYear = 2025; // Set the current year
    birthYear = currentYear - age; // Calculate birth year

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
