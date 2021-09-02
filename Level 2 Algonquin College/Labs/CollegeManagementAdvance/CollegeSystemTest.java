package CollegeManagementAdvance;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 26, 2021
*/

/**
 * This class contains the main method and it is responsible for executing all
 * appropriate methods
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */
public class CollegeSystemTest {

	/**
	 * Main method
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		/** Name of the college **/
		String name;// Name of the college
		Input input = new Input();
		

		System.out.print("Please enter the name of your College: ");
		name = input.inputFullString();


		College c1 = new College(name);// composition
		c1.mainMenu(input);

	}

}
