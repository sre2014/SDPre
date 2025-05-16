import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      // Call the menu method to print the menu
      printMenu();

      // Take user's input
      selection = scanner.nextInt();

      // Respond based on user input
      if(selection == 1) {
        System.out.println("Hello");
      } else if(selection == 2) {
        System.out.println("Apple, Banana, Coconut");
      } else if(selection == 3) {
        System.out.println("Goodbye");
        break; // Exit the loop
      } else {
        System.out.println("Invalid selection. Please try again.");
      }
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
