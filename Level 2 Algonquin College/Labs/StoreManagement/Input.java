package StoreManagement;

import java.util.Scanner;

//a class with scanner and responsible for taking user input of various data types
public class Input {

	Scanner keyboard = new Scanner(System.in);

	// inputs string with .next
	public String inputString() {
		String input = keyboard.next();
		keyboard.nextLine();
		return input;
	}//end method

	// inputs string with .nextline
	public String inputFullString() {
		String input = keyboard.nextLine();
		return input;
	}//end method

//inputs integer
	public int inputInteger() {
		int input;
		while (!(keyboard.hasNextInt())) {
			System.out.println("Please enter a valid integer");
			keyboard.nextLine();
		}
		input = keyboard.nextInt();
		keyboard.nextLine();
		return input;
	}//end method

	// inputs double
	public double inputDouble() {
		double input;
		while (!(keyboard.hasNextDouble())) {
			System.out.println("Please enter a valid double");
			keyboard.nextLine();
		}
		input = keyboard.nextDouble();
		keyboard.nextLine();
		return input;
	}//end method

	// inputs long
	public long inputLong() {
		long input;
		while (!(keyboard.hasNextLong())) {
			System.out.println("Please enter a valid long");
			keyboard.nextLine();
		}
		input = keyboard.nextLong();
		keyboard.nextLine();
		return input;
	}//end method

}// end class
