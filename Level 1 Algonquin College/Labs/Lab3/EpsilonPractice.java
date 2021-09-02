package Lab3;

//This class contains objects and methods from other classes and uses them in the main method
public class EpsilonPractice {

	// This method compares two values entered by the user by two ways, it also asks
	// the user
	// to enter a value which would determine whether the extent of deviation
	// between the two values is feasible or not

	// Firstly, it returns true or false using equality sign between them

	// Secondly, it uses the third value entered by the user to determine whether
	// the absolute
	// difference between the two inputs is within the range of the third input

	public static void main(String[] args) {

		EpsilonTester epsilonTester = new EpsilonTester();
		final int CONTINUE_PROGRAM = 1; // use this for the loop
		int continueProgram = 0; // for user entry regarding continue program
		String report = ""; // used for outputs

		do { // loop to keep inputing values, comparing and outputting results

			epsilonTester.interactWithUserForFieldValues(); // this method asks the user for target number, test number
															// and epsilon

			System.out.println();
			report = epsilonTester.compareWithEquality(); // this method does direct comparison using equality sign
			System.out.println(report);

			System.out.println();
			report = epsilonTester.compareWithEpsilon();// this method compares the two users with respect to the
														// epsilon
			System.out.println(report);

			System.out.println("Program by Karmandeep Singh \n");
			System.out.println("Enter 1 to run another test: ");
			System.out.println("Enter 0 to exit the program: ");

			continueProgram = User.inputInteger(); // taking in value for the continuty loop later

			while (!(continueProgram == 0 || continueProgram == 1)) { // continuty loop asking whether to continue
																		// adding and
																		// comparing values or not

				System.out.println("Please enter valid option: \n");

				System.out.println("Enter 1 to run another test: ");
				System.out.println("Enter 0 to exit the program: ");

				continueProgram = User.inputInteger();
			} // end of continuty loop

		} while (continueProgram == CONTINUE_PROGRAM); // end of main loop

		System.out.println("Program has exited"); // after loop exits

	}// end main method

}// end class
