import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    // TODO: prompt the user to get input for all of the above int variables.
    System.out.print("Please enter the first integer: ");
    num1 = keyboard.nextInt();

    System.out.print("Please enter the second integer: ");
    num2 = keyboard.nextInt();

    System.out.print("Please enter the third integer: ");
    num3 = keyboard.nextInt();

    // TODO: prompt the user to get input for all of the above double variables.
    System.out.print("Please enter the first double: ");
    dub1 = keyboard.nextDouble();

    System.out.print("Please enter the second double: ");
    dub2 = keyboard.nextDouble();

    System.out.print("Please enter the third double: ");
    dub3 = keyboard.nextDouble();

    // TODO: print the three ints and their sum.
    int intSum = num1 + num2 + num3;
    System.out.println("\nThe sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);

    // TODO: print the three doubles and their sum.
    double doubleSum = dub1 + dub2 + dub3;
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + doubleSum);

    keyboard.close(); // Always good to close your Scanner
  }
}
