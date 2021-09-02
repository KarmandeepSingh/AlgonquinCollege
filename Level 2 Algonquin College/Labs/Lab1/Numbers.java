package Lab1;
public class Numbers {

	////////// exercise 1///////////

	private int size; // declaring an integer which will later be used as a field for the constructor
	// noting array length

	private int[] Numbers; // declaring an array

	String[][] stars = new String[10][10];

	// constructor with size as it's only field
	public Numbers(int size) {
		this.size = size;
		Numbers = new int[size];
	}

	// method which assigns values to the array depending on the array size
	public void generateNumbers() {
		for (int i = 0; i < size; i++) {
			Numbers[i] = i;
		} // end for loop
	}

	// method which outputs the each element of the array
	public void printNumbers() {
		for (int i = 0; i < size; i++) {
			System.out.print(Numbers[i] + "  ");
		} // end for loop
	}

	//////// exercise-2////////////
	int row;
	int col;
	int[][] numbers; // declaring a 2d array

	// parameterized constructor
	public Numbers(int row, int col) {
		this.row = row;
		this.col = col;
		numbers = new int[row][col];
	}

	// method that prints out the location of the array as if it is on a cartesian 
	// plane
	public void printIndices() {
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[r].length; c++) {
				System.out.printf("%d, %-7d", r, c);
			}
			System.out.println();
		}
	}
	
	//creates a square matrix of 10 X 10 size  containing squares of numbers from 10 to 109
	public void generateSquares() {
		for (int i = 10; i < 99;) {
			for (int r = 0; r < numbers.length; r++) {

				for (int c = 0; c < numbers[r].length; c++) {

					numbers[r][c] = (int) Math.pow(i, 2);
					i++;
				}

			}
		}
	}
	
	//prints the square matrix in a right angled triangle pattern
	public void printSquares() {
		for (int r = 0; r < numbers.length - 1; r++) {
			for (int c = 0; c < numbers[r].length - 1; c++) {
				if (r >= c) {

					System.out.printf("%-9d", numbers[r][c]);

				}

			}
			System.out.println();
		}
	}

	//print stars in a right angle triangle pattern
	public void printStarsPattern1() {


		for (int r = 0; r < stars.length; r++) {
			for (int c = 0; c < stars[r].length; c++) {
				if (r >= c) {

					System.out.printf("*  ");

				}

			}
			System.out.println();
		}

	}
	//prints out stars in the other half right angled triangle pattern
	public void printStarsPattern2() {
		for (int r = 0; r < stars.length - 1; r++) {
			for (int c = 0; c < stars[r].length - 1; c++) {
				if (r <= c) {

					System.out.printf("*  ");

				}

			}
			System.out.println();
		}
	}

}// end class
