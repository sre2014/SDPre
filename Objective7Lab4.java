public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 1;     // Counter starts at 1
    int sum = 0;       // Sum starts at 0

    while(count <= 20) {
      sum = sum + count;   // Add current count to sum
      count++;             // Increment counter
    }

    System.out.println("The sum of numbers from 1 to 20 is: " + sum);
  }
}
