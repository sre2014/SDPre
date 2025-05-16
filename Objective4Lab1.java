public class Objective4Lab1 {
  public static void main(String[] args) {

    // Specific details provided
    String fname = "Lets";
    String lname = "Cee";
    String favoriteAnimal = "Humans";
    String favoriteFood = "Artichoke and spinach dip";
    String favoriteSong = "probably something I wrote and performed";

    // Printing prompts (with the >> part for the input style)
    System.out.println("What is your first name?");
    System.out.println(">> " + fname);

    System.out.println("What is your last name?");
    System.out.println(">> " + lname);

    System.out.println("What is your favorite animal?");
    System.out.println(">> " + favoriteAnimal);

    System.out.println("What is your favorite food?");
    System.out.println(">> " + favoriteFood);

    System.out.println("What is your favorite song?");
    System.out.println(">> " + favoriteSong);

    // Now printing the formatted output with your specific details
    System.out.println("\nMy name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
  }
}
