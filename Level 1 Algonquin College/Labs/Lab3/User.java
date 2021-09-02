package Lab3;

import java.util.Scanner;

/*
 * This class has two methods for collecting numbers from a console,
 * both methods verify that the data is numerical, or the person
 * using the console will be prompted for an acceptable number until they
 * provide one. 
 */
public class User {
	
	/*
	 * A single scanner object is used for input operations in this class. 
	 */
	private static Scanner keyboard = new Scanner(System.in);
	
	/*
	 * This method validates that a number input at the console is
	 * an int value, if the input is not numerical a loop will 
	 * repeatedly ask for a correct numerical value.
	 */
	public static int inputInteger() {
		int value = 0;
		while( ! keyboard.hasNextInt() ) {
			System.out.println("Invalid input, expecting integer number");
			System.out.print("Please enter an integer number:");
			keyboard.nextLine(); // clean out bad data
		}
		value = keyboard.nextInt();
		keyboard.nextLine(); // clean up the input stream
		return value;
	}
	
	/*
	 * This method validates that a number input at the console is
	 * a double value, if the input is not numerical a loop will 
	 * repeatedly ask for a correct numerical value.
	 */
	public static double inputDouble() {
		double value = 0.0;
		while( ! keyboard.hasNextDouble() ) {
			System.out.println("Invalid input, expecting decimal-point number");
			System.out.print("Please enter a decimal-point number:");
			keyboard.nextLine(); // clean out bad data
		}
		value = keyboard.nextDouble();
		keyboard.nextLine(); // clean up the input stream
		return value;
	}
}
