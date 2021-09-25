package Lab1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Karmandeep Singh 
 * Student Number: 41025022 
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * @author Karmandeep Singh
 */
public class Lab1 {

	/**
	 * Main method for the program.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Numbers num = new Numbers();
		displayMenu(keyboard, num);

	}

	/**
	 * Displays the menu 
	 * @param keyboard Scanner object to use for input
	 * @param num Numbers object for the array
	 */
	public static void displayMenu(Scanner keyboard, Numbers num) {
		boolean control = true; //keeps the menu running
		int option = 0; //option entered by the user 
		do {
			System.out.println("Please select one of the following:");
			System.out.println("1: Initialize a default array");
			System.out.println("2: To specify the max size of the array");
			System.out.println("3: Add value to the array");
			System.out.println("4: Display values in the array");
			System.out.println("5: Display average of the values, minimum value, maximum value");
			System.out.println("6: To Exit");
			System.out.print(">");
			
			boolean intCheck = true; //checks if user has entered an integer or not
			do {
				try {

					option = keyboard.nextInt();
					keyboard.nextLine();
					intCheck = false;
				} catch (InputMismatchException ime) {
					System.err.print("Wrong datatype entered: ");
					keyboard.nextLine();
				}
			} while (intCheck); // end do-while loop

			switch (option) {
			case 1:
				num = new Numbers();
				System.out.println();
				break;
			case 2:
				int arraySize = 0;

				intCheck = true;
				do {
					try {
						System.out.print("Enter new size of array: ");
						arraySize = keyboard.nextInt();
						keyboard.nextLine();
						intCheck = false;
					} catch (InputMismatchException ime) {
						System.err.println("Wrong datatype entered: ");
						keyboard.nextLine();
					}
				} while (intCheck); // end do-while loop
				num = new Numbers(arraySize);
				System.out.println();
				break;
			case 3:
				num.addValue(keyboard);
				System.out.println();
				break;
			case 4:
				System.out.println("Numbers are: ");
				System.out.println(num.toString());

				break;
			case 5:
				System.out.printf("Average is %.2f, Minimum value is %.2f, Maximum is %.2f%n", num.calcAverage(),
						num.findMinMax()[0], num.findMinMax()[1]);
				System.out.println();
				break;
			case 6:
				control = false;
				System.out.println("Thank you for using the program");
				break;
			default:
				System.err.println("Wrong option selected");
				break;

			}

		} while (control);

	}

}
