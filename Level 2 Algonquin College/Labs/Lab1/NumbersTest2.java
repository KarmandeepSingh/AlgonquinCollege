package Lab1;

import java.util.Scanner;

public class NumbersTest2 {

	public static void main(String[] args) {
		int height;// determines the array size

		Scanner sc = new Scanner(System.in);

		System.out.println("Printing stars in pattern");
		System.out.print("Enter height(-1 to quit): ");
		while (!sc.hasNextInt()) {
			System.out.println("Please input a valid integer: ");
			sc.nextLine();
		} // end while loop
		height = sc.nextInt();
		sc.nextLine();

		while (!(height == -1)) {

			while (!(height % 2 == 1 && height >= 5)) {
				String a = "Invalid entry... Must be an odd integer 5 or greater. ";
				String b = "Please try again: ";
				System.out.print(a + b);
				height = sc.nextInt();
				sc.nextLine();
			} // end while loop

			String[][] stars = new String[height][2 * height];// declaring an array with collumns are double of the rows

			for (int i = 0; i < stars.length; i++) {
				for (int j = 0; j < stars[i].length; j++) {
					stars[i][j] = " ";
				} // end for loop for j

			} // end for loop for i

			for (int i = 0; i < stars.length; i++) {
				if (i <= (stars.length / 2)) {
					for (int j = 0; j < (2 * i) + 1; j++) {
						stars[i][j] = "*";
						stars[i][(2 * height) - 1 - j] = "*";
					} // end for loop for j
				} // end if loop
				else {
					for (int j = 0; j < 2 * (height - 1 - i) + 1; j++) { // i=6,j=0
						stars[i][j] = "*";
						stars[i][(2 * height) - 1 - j] = "*";
					} // end for loop for j

				} // end else loop

			} // end for loop for i

			for (int i = 0; i < stars.length; i++) {
				for (int j = 0; j < stars[i].length; j++) {
					System.out.print(stars[i][j]);
				} // end for loop for j
				System.out.println();
			} // end for loop for i
			System.out.println("Printing stars in pattern");
			System.out.print("Enter height(-1 to quit): ");
			height = sc.nextInt();
			sc.nextLine();

		} // end while loop

		System.out.println("Thank You for using the program");
		sc.close();
	}// end main method

}// end class
