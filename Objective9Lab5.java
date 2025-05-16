import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    // Part 1: Prompt the user to provide one number and store their input in num1
    System.out.print("Please give me a number: ");
    num1 = kb.nextDouble();

    // Part 2: Prompt the user for another number and store their input in num2
    System.out.print("Please give me another number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      switch (choice) {
        // Part 3: Add Numbers
        case 1:
          answer = findSum(num1, num2);
          System.out.println("The sum of " + num1 + " and " + num2 + " is: " + answer);
          break;

        // Part 4: Find Average
        case 2:
          answer = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
          break;

        // Part 5: Calculate Tax
        case 3:
          answer = calcTax(num1, num2);
          System.out.println("The tax on " + num1 + " and " + num2 + " is: " + answer);
          break;

        // Exit the program
        case 4:
          System.out.println("Exiting the program.");
          keepGoing = false;
          break;

        // Handle invalid input
        default:
          System.out.println("Invalid selection. Please choose a valid option.");
      }
    }

    kb.close();
  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  // Part 3: Method to find the sum of two numbers
  public static double findSum(double x, double y) {
    return x + y;
  }

  // Part 4: Method to find the average of two numbers
  public static double findAverage(double x, double y) {
    return (x + y) / 2;
  }

  // Part 5: Method to calculate the tax of the two numbers with a tax rate of 8.31%
  public static double calcTax(double x, double y) {
    double total = x + y;
    double taxRate = 0.0831;
    return total * taxRate;
  }
}
