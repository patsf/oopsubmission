import java.util.Scanner;

public class Fraction{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the numerator: ");
        int numerator = scan.nextInt();

        System.out.print("Type the denominator: ");
        int denominator = scan.nextInt();

        if (denominator != 0) {
            double decimal = (double) numerator / denominator;
            System.out.println("The decimal equivalent of this fraction is " + decimal);
        }
    }
}
