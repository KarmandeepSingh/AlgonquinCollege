package Lab4;
import java.util.Scanner;

public class UserInput {

	private Scanner scanner = new Scanner(System.in);

	public String inputText() { // inputs string data type

		return scanner.nextLine();

	}

	public double inputDouble() { // keeps on asking for double until the user enters a valid double

		double result = 0;

		while (!scanner.hasNextDouble()) {

			System.err.println("Please enter a valid double");

			scanner.nextLine(); // clean up the input stream
			
			System.out.print("Enter again: ");
		}
		result = scanner.nextDouble();
		scanner.nextLine();
		return result;
	}

	public int inputInteger() { // keeps on asking for integer until the user enters a valid double

		int result = 0;
		while (!scanner.hasNextInt()) {
			System.err.println("Please enter a valid integer");

			scanner.nextLine(); // clean up the input stream
			
			System.out.print("Enter again: ");
		}
		result = scanner.nextInt();
		scanner.nextLine(); // clean up the input stream
		return result;
	}

}
