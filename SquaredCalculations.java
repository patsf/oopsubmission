import java.util.Scanner;

public class SquaredCalculations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the side of the square: ");
        int sideLength = scan.nextInt();

        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
