package Lab1;
public class NumbersTest {
	public static void main(String[] args) {

		Numbers n1 = new Numbers(10); // instantiating a Numbers object with 10 as the size field

		n1.generateNumbers(); // populating the array

		System.out.println("Printing Numbers:\n");

		n1.printNumbers(); // printing each element of the array

		System.out.println("\n\nPrinting Positions:\n");
		Numbers n2 = new Numbers(10, 10); // instantiating a new Numbers object with 10 as the two fields
		n2.printIndices();// printing the positions

		n2.generateSquares(); // making each element of the array as the squares of 10 to 109
		System.out.println("\nPrinting Squares:\n");
		n2.printSquares(); // displaying them in a pattern

		System.out.println("\nPrintting Stars in Pattern:\n");

		// printing out stars in a triangle
		n2.printStarsPattern1();
		n2.printStarsPattern2();

	}// end main method

}// end class
