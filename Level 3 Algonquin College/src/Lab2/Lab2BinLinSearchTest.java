package Lab2;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains the menu and the dynamically allocated array from which
 * the users search for their desired elements
 * Student Name: Karmandeep Singh 
 * Student Number: 41025022 
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * @author Karmandeep Singh
 *
 */
public class Lab2BinLinSearchTest {

	/**
	 * Main method for the program.
	 * 
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		boolean control = true;
		boolean intCheck = true;

		int option = 0;
		Scanner scan = new Scanner(System.in);
		BinaryLinearSearch search = new BinaryLinearSearch();
		int searchKey = 0;
		int[] randomArr = null;

		do {
			try {
				do {
					try {
						System.out.println("Select your option in the menu:");
						System.out.println("1. Initialize and populate an array of 30 random integers.");
						System.out.println("2. Perform recursive binary and linear search.");
						System.out.println("3. Perform iterative binary and linear search.");
						System.out.println("4. Exit.");
						System.out.print(">");
						option = scan.nextInt();
						scan.nextLine();
						intCheck = false;

					} catch (InputMismatchException ie) {
						scan.nextLine();
						System.err.println("**Input Mismatch Exception**");
					}
				} while (intCheck);

				switch (option) {
				case 1:

					System.out.println("Array of randomly generated integers: ");
					randomArr = search.generateRandomInts();
					System.out.println("Sorted array: " + Arrays.toString(randomArr));

					break;
				case 2:
					intCheck = true;
					do {
						try {
							System.out.print("Please enter an integer value to search: ");
							searchKey = scan.nextInt();
							scan.nextLine();
							intCheck = false;
						} catch (InputMismatchException ie) {
							scan.nextLine();
							System.err.println("***Input Mismatch Exception***");
						}
					} while (intCheck);
					for (int j : randomArr)
						System.out.print(j + " ");

					System.out.println();
					search.recursiveBinarySearch(randomArr, 0, 29, searchKey);
					search.recursiveLinearSearch(randomArr, 29, searchKey);

					break;
				case 3:
					intCheck = true;
					do {
						try {
							System.out.print("Please enter an integer value to search: ");
							searchKey = scan.nextInt();
							scan.nextLine();
							intCheck = false;
						} catch (InputMismatchException ie) {
							scan.nextLine();
							System.err.println("***Input Mismatch Exception***");
						}
					} while (intCheck);

					for (int i : randomArr) {
						System.out.print(i + " ");
					}
					System.out.println();

					search.iterativeBinarySearch(randomArr, searchKey);
					search.iterativeLinearSearch(randomArr, searchKey);
					break;
				case 4:
					control = false;
					System.out.println("exiting...");
					break;
				default:
					System.err.println("Please choose the option 1 to 4.");
					break;
				}
			} catch (NullPointerException ne) {
				System.err.println("Array empty");
			}
		} while (control);

		control = true;

		scan.close();

	}

}
