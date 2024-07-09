import java.util.Scanner;
import java.util.Random;

public class PinEncryptor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter 4 Digit Pin: ");
        int pin = scan.nextInt();

        String pinHex = Integer.toHexString(pin);
        int random1 = 1000 + rand.nextInt(64536 - 1000);
        int random2 = 1000 + rand.nextInt(64536 - 1000);

        String randomHex1 = Integer.toHexString(random1);
        String randomHex2 = Integer.toHexString(random2);

        String encryptedPin = randomHex1 + pinHex + randomHex2;

        System.out.println("Encrypted Pin " + encryptedPin);
    }
}
