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
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float[] numbers;

	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Stores the max size of the array
	 */
	private int maxSize;

	/**
	 * Default Constructor
	 */
	public Numbers() {
		numbers = new Float[0];
	}

	/**
	 * Constructor that initializes the numbers array.
	 * 
	 * @param maxSize - Max size of the numbers array
	 */
	public Numbers(int maxSize) {
		
		this.maxSize = maxSize;
		numbers = new Float[maxSize]; // initializes an array of maxSize
	}

	/**
	 * Adds a value in the array
	 * 
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		
		Float value = 0.0F;
		boolean control = true; // variable to allow the user to re enter value in case of wrong input
		Float[] temp = numbers;// temporary array to store the numbers array

		numItems = 0;

		for (int i = 0; i < numbers.length; i++) { // calculates the number of elements in the array
			if (numbers[i] != null) {
				numItems++;
			}
		}

		if (maxSize == 0) { // if max size has not been initialized by the user
			numbers = new Float[numItems + 1]; // increases the size of array by one to accommodate the new value

			for (int i = 0; i < numItems; i++) { // populates the numbers array with previously entered values
				numbers[i] = temp[i];
			}
			do {

				try {

					System.out.print("Enter value: ");
					
					value = keyboard.nextFloat();
					
					keyboard.nextLine();

					control = false;
					numbers[numItems] = value;
				} catch (InputMismatchException ie) {
					keyboard.nextLine();
					System.err.println("Enter a valid float");
				}

			} while (control);

		} else { // if max size has been initialized by the user

			do {

				try {

					if (numItems == maxSize) { // if user has reached the max size of the array
						throw new ArrayIndexOutOfBoundsException();

					}

					System.out.print("Enter value: ");
					value = keyboard.nextFloat();
					keyboard.nextLine();

					control = false;
					numbers[numItems] = value;
				} catch (InputMismatchException ie) {
					keyboard.nextLine();
					System.err.println("Enter a valid float");
				} catch (ArrayIndexOutOfBoundsException ae) {
					System.err.println("Array full");
					control = false;
				}

			} while (control);

		}

	}

	/**
	 * Calculates the average of all the values in the numbers array.
	 * 
	 * @return float value that represents the average
	 * 
	 */
	public float calcAverage() {
		
		Float avg = 0.0F;

		numItems = 0;
		for (int i = 0; i < numbers.length; i++) { // calculates the number of elements in the array
			if (numbers[i] != null) {
				numItems++;
			}
		}

		try {

			if (numItems == 0) { // if array is empty
				throw new ArithmeticException();
			}
			for (int i = 0; i < numItems; i++) {
				avg += numbers[i];
			}
			avg = avg / numItems;

		} catch (ArithmeticException ae) {
			avg = 0.0F;
		}

		return avg;
	}

	/**
	 * Calculates the maximum and minimum element of the array
	 * 
	 * @return An array whose first element is minimum and second is maximum
	 */
	public Float[] findMinMax() {

		Float[] minMax = new Float[2]; // a float array, with its first element being the minimum value of the numbers
										// array and second being the maximum value

		numItems = 0;
		for (int i = 0; i < numbers.length; i++) { // calculates the number of elements in the array
			if (numbers[i] != null) {
				numItems++;
			}
		}

		try {
			if (numItems == 0) { //if the numbers array is empty
				throw new ArithmeticException();
			}

			minMax[0] = numbers[0];
			for (int i = 1; i < numItems; i++) { //searches for the minimum value
				if (minMax[0] > numbers[i]) {
					minMax[0] = numbers[i];
				}
			}

			minMax[1] = numbers[0];
			for (int i = 1; i < numItems; i++) { //searches for the maximum value
				if (minMax[1] < numbers[i]) {
					minMax[1] = numbers[i];
				}
			}
		} catch (ArithmeticException ae) { 
			minMax[1] = 0.0F;
			minMax[0] = 0.0F;
		}
		return minMax;

	}

	/**
	 * Returns all the elements of the array in String format
	 */
	@Override
	public String toString() {
		String arrayElements = ""; //stores the array elements in string format
		numItems = 0;
		for (int i = 0; i < numbers.length; i++) {// calculates the number of elements in the array
			if (numbers[i] != null) {
				numItems++;
			}
		}
		try {
			for (int i = 0; i < numItems; i++) { 

				arrayElements += String.format("%s%n", Float.toString(numbers[i])); 

			}
		} catch (NullPointerException ne) {
			arrayElements = "";
		}
		return arrayElements;

	}

}
