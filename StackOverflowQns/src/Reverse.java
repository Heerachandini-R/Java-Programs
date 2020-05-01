
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Type a number: ");
		String num = scnr.nextLine();
		String reverse = "";
		scnr.close();
		for (int i = num.length() - 1; i >= 0; i--) {
			reverse = reverse + num.charAt(i);

		}

		System.out.println("Reverse is: " + reverse);

	}
}