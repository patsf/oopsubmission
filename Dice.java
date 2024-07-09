import java.util.Scanner;
import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many sides does dice 1 have? ");
        int sides1 = scan.nextInt();
        System.out.print("How many sides does dice 2 have? ");
        int sides2 = scan.nextInt();
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= 3; i++) {
            int roll1 = rand.nextInt(sides1) + 1;
            int roll2 = rand.nextInt(sides2) + 1;
            sum1 += roll1;
            sum2 += roll2;
            System.out.println("Dice 1 roll " + i + " = " + roll1);
            System.out.println("Dice 2 roll " + i + " = " + roll2);
        }

        double avg1 = sum1 / 3.0;
        double avg2 = sum2 / 3.0;

        System.out.println("Dice 1 rolled a total of " + sum1 + " and rolled " + avg1 + " on average.");
        System.out.println("Dice 2 rolled a total of " + sum2 + " and rolled " + avg2 + " on average.");
    }
}
