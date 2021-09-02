package Lab4;
public class MetalCubeProgram {

	public static void main(String[] args) {
		final int ENTER_DATA = 1; // declaring constants later to be used in a menu
		final int REPORT = 2;
		final int EXIT = 0;
		int option = 0;
		boolean program = true;
		int runNumber = 0;
		MetalCubeAnalyzer analyzer = new MetalCubeAnalyzer();
		UserInput input = new UserInput();

		while (program) { // a loop to keep the program running,
							// unless the user enters an option to exit the program e.g. a zero.

			System.out.println("Enter 1 for cube entry");
			System.out.println("Enter 2 to show report");
			System.out.println("Enter 0 to exit program");
			System.out.println("Program by Karmandeep Singh");
			System.out.print("Enter option: ");
			option = input.inputInteger();

			// a menu for the user using the constants
			// above, also outputs my full name.
			// inputs the user option and makes a choice:
			// if they want to enter data appropriate method on the
			// analyzer is called.
			// if they want a report call the appropriate method on the analyzer is called.
			// if they want to exit, prints a message thanking them for using the
			// program, and lets the loop terminate normally.

			switch (option) {
			case ENTER_DATA:

				runNumber++; // to eliminate the confusion of how many times the program has been run, this
								// puts out a message indicating that
				System.out.println("Enter details of cube "+runNumber);

				analyzer.enterCube();
				break;

			case REPORT:
				analyzer.printReport();
				break;

			case EXIT:
				program = false;
				break;

			default:
				System.err.println("Invalid input");
				break;

			}// end switch

		} // end while loop

		System.out.println("Thanks for using the program");
		System.out.println("Program by Karmandeep Singh");

	}// end main method
}// end class