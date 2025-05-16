public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1 = 3.0;
    double side2 = 4.0;
    double hypotenuse;

    // a² + b² = c² → c = √(a² + b²)
    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.println("The hypotenuse is: " + hypotenuse);
  }
}
