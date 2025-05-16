public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;

    // Generate random integers between 1 and 6
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);

    System.out.println("First random number: " + first);
    System.out.println("Second random number: " + second);
    System.out.println("Third random number: " + third);
  }
}
