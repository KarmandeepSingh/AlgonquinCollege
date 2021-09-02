package BankManagement;

import java.util.Scanner;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * A class with scanner and responsible for taking user input of various data
 * types
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */

public class Input {

	Scanner keyboard = new Scanner(System.in);

	/**
	 * inputs string with .next
	 * 
	 * @return the string entered by the user
	 */
	public String inputString() {
		String input = keyboard.next();
		keyboard.nextLine();
		return input;
	}// end method

	/**
	 * Inputs string with .nextline
	 * 
	 * @return The full string entered by the user
	 */

	public String inputFullString() {// inputs string with .nextline
		String input = keyboard.nextLine();
		return input;
	}// end method

	/**
	 * Inputs integer
	 * 
	 * @return the integer entered by the user
	 */
	public int inputInteger() {// inputs integer
		int input;
		while (!(keyboard.hasNextInt())) {
			System.err.print("Please enter a valid integer: ");
			keyboard.nextLine();
		}
		input = keyboard.nextInt();
		keyboard.nextLine();
		return input;
	}// end method

	/**
	 * Inputs only positive integer
	 * 
	 * @return the integer entered by the user
	 */
	public int inputPositiveInteger() {
		int input;

		input = inputInteger();
		while (input < 0) {
			System.err.print("Please enter a positive integer: ");
			input = inputInteger();
		}

		return input;

	}// end main method

	/**
	 * Inputs double
	 * 
	 * @return The double entered by the user
	 */
	public double inputDouble() {// inputs double
		double input;
		while (!(keyboard.hasNextDouble())) {
			System.err.print("Please enter a valid double: ");
			keyboard.nextLine();
		}
		input = keyboard.nextDouble();
		keyboard.nextLine();
		return input;
	}// end method

	/**
	 * Inputs only positive double
	 * 
	 * @return the double entered by the user
	 */
	public double inputPositiveDouble() {
		double input;
		input = inputDouble();
		while (input < 0) {
			System.err.print("Please enter a positive double: ");
			input = inputDouble();
		}
		return input;

	}// end main method

	/**
	 * Inputs long
	 * 
	 * @return Long entered by the user
	 */
	public long inputLong() {// inputs long
		long input;
		while (!(keyboard.hasNextLong())) {
			System.err.print("Please enter a valid long: ");
			keyboard.nextLine();
		}
		input = keyboard.nextLong();
		keyboard.nextLine();
		return input;
	}// end method

	/**
	 * Inputs only positive long
	 * 
	 * @return the long entered by the user
	 */
	public long inputPositiveLong() {
		long input;
		input = inputLong();
		while (input < 0) {
			System.err.print("Please enter a positive long: ");
			input = inputLong();
		}
		return input;

	}// end main method

}// end class
