import java.util.Scanner;

/*
 * POTUS Requirements:
 * - 35 yrs or older
 * - natural born citizen
 * - resident for 14 years
 */

public class Exercise14 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Are you eligible to run for President of the United States of America?");
        System.out.println("Let's find out!");

        System.out.print("How old are you? ");
        int age = kb.nextInt();

        System.out.print("Are you a natural born citizen of the USA (true or false)? ");
        boolean isCitizen = kb.nextBoolean();

        System.out.print("Have you resided in the USA for at least 14 years (true or false)? ");
        boolean isResident = kb.nextBoolean();

        boolean isEligible = ((age >= 35) && isCitizen && isResident);

        System.out.println("You are eligible to run for POTUS: " + isEligible);
    }
}
