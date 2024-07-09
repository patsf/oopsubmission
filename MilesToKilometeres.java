import java.util.Scanner;

public class MilesToKilometeres{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double miles = scan.nextDouble();

        double kilometers = miles * 1.60935;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
	