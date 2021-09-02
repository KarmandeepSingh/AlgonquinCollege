package CollegeManagementAdvance;

import java.util.ArrayList;
import java.util.InputMismatchException;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 26, 2021
*/
/**
 * This class is composition of the Student class and the purpose is to create a
 * type of database of the entries provided by the user
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 */
public class College {

	/** Name of the student's college **/
	private String collegeName;// Name of the student's college
	/** Array List of students **/
	ArrayList<Student> students;
	/** Total number of students **/
	static int totalStudents;

	/** Option 1 as Full time Student for ReadStudentDetails method **/
	final static int FULLTIME_STUDENT = 1;
	/** Option 2 as Part time Student for ReadStudentDetails method **/
	final static int PARTTIME_STUDENT = 2;

	/** Option 1 for MainMenu method **/
	final static int READ_FROM_KEYBOARD = 1;
	/** Option 2 for MainMenu method **/
	final static int READ_FROM_FILE = 2;
	/** Option 3 for MainMenu method **/
	final static int PRINT = 3;
	/** Option 4 for MainMenu method **/
	final static int EXIT = 4;

	/**
	 * Parameterized Constructor
	 * 
	 * @param collegeName   Name of the student's college
	 * @param totalStudents Number of students and is used to create the student
	 *                      array of appropriate size
	 */
	College(String collegeName) {
		
		this.collegeName = collegeName;
		students = new ArrayList<Student>();
	}

	/**
	 * Prints the title and the header row of the output
	 */
	public void PrintTitle() {

		for (int i = 0; i < 122; i++) { // prints a line of stars to highlight the title
			System.out.print("*");
		} // end for loop
		System.out.printf("%n%57s  - List of Students%n", collegeName);
		for (int i = 0; i < 122; i++) { // prints a line of stars to highlight the title
			System.out.print("*");
		} // end for loop

		{ // Prints out the header row of the outputs using the formatted output

			String p = "Program";
			String s = "Student#";
			String n = "Name";
			String e = "Email";
			String ph = "Phone";
			String g = "GPA";
			String t = "Tution fees";
			String f = " Credits";

			System.out.printf("%n%7s| %8s| %25s| %25s| %15s| %7s| %12s| %7s|", p, s, n, e, ph, g, t, f);
			System.out.println();
		}
		for (int i = 0; i < 122; i++) { // prints a line of stars to highlight the title
			System.out.print("*");
		} // end for loop
		System.out.println();

	}

	/**
	 * Provides the user with an option to enter the student type as part time or
	 * full time and then performs other appropriate methods accordingly
	 * @param input Uses scanner from the Input class to take input from the user
	 */
	public void ReadStudentDetails(Input input) {

		// asks the user to enter the number of students every time the read from the
		// keyboard is chosen
		if (totalStudents == 0) {
			System.out.print("Please enter the number of students: ");
			totalStudents = input.inputPositiveInteger();
		}

		// asks the user to enter the details for the each student
		for (int i = 0; i < totalStudents; i++) {

			int option = 0;// used for switch

			boolean control = true;// used to execute the try until the user enters valid options
			do {

				try {

					System.out.printf("Please enter details of student %d", students.size() + 1);
					System.out.println();
					for (int j = 0; j < 50; j++) {// Prints a line of "=" just before each student's details are about
													// to be
													// entered

						System.out.print("=");
					} // end for loop

					System.out.println("\n1 - Fulltime student");
					System.out.println("2 - Parttime student");
					System.out.print("Please enter Student type: ");

					option = input.inputPositiveInteger();

					// menu to allow the user to enter the student type
					if ((option != FULLTIME_STUDENT) && (option != PARTTIME_STUDENT)) {
						throw new Exception();
					}

					switch (option) {

					case FULLTIME_STUDENT:
						students.add(new FulltimeStudent());
						students.get(students.size() - 1).readInfo(input);
						break;

					case PARTTIME_STUDENT:
						students.add(new ParttimeStudent());
						students.get(students.size() - 1).readInfo(input);
						break;

					}

					control = false; // after the successful execution of the code
										// allows to exit the do-while loop

				} catch (Exception e) {
					System.err.println("Wrong option");
				}
			} while (control == true);

		}

		totalStudents = 0; // resets the total number of the students to 0 and allows the initial if
							// statement to execute

	}

	/**
	 * Reads student details from a file and adds the corresponding student in the
	 * array list
	 * 
	 * @param input Uses scanner from the Input class to read details from an
	 *              external file
	 */
	public void ReadFromFile(Input input) {
		input.openFile("Labs\\CollegeManagementAdvance\\students.txt");

		try {
			// loop executes until everything has been processed by the scanner
			while (input.readHasNext()) {
				// enters the statement if the student type is full time
				if (input.readNextString().equals("f")) {

					// uses the parameterized constructor to add a fulltime student
					students.add(new FulltimeStudent(input.readNextInt(), input.readNextString(),
							input.readNextString(), input.readNextString(), input.readNextLong(),
							input.readNextString(), input.readNextDouble(), input.readNextDouble()));
					// enters the statement if the student type is parttime time
				} else {
					// uses the parameterized constructor to add a parttime student
					students.add(
							new ParttimeStudent(input.readNextInt(), input.readNextString(), input.readNextString(),
									input.readNextString(), input.readNextLong(), input.readNextString(),
									input.readNextDouble(), input.readNextDouble(), input.readNextDouble()));
				}
			}
			System.out.println("**File read**");
		} catch (InputMismatchException ime) {
			System.out.println(ime);
		} catch (IllegalStateException ise) {
			System.out.println(ise);
		} catch (NullPointerException npe) {
			System.out.println(npe);
			;
		}

	}

	/**
	 * Calls printInfo method from other classes to print the final and properly
	 * formatted details of the students
	 */
	public void PrintStudentDetails() {

		// prints student info only if there are any students in the array
		if (students.size() != 0) {

			PrintTitle();
			try {
				for (int i = 0; i < students.size(); i++) {
					students.get(i).printInfo();
					System.out.println();
				}
			} catch (ArrayIndexOutOfBoundsException aiobe) {
				System.out.println(aiobe);
			} catch (NullPointerException npe) {
				System.out.println(npe);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else {
			System.out.println("##### No students to display #####");
		}
	}

	/**
	 * The main menu that allows the user to enter student student details through
	 * their input or from the file. Also allows them to print student details. At
	 * last also allows them to exit the program
	 * 
	 * @param input Scanner object from Input class that allows input from the user
	 */
	public void mainMenu(Input input) {
		int option = 0;

		boolean control = true;
		// this do-while loop runs until uses enters 4 to exit the program
		do {
			// this do-while loop runs until user enters valid input
			do {

				try {
					System.out.println("1. Read Students info from keyboard");
					System.out.println("2. Read Students info from file");
					System.out.println("3. Print details of all students");
					System.out.println("4. Exit");

					System.out.print("Choose your option: ");
					option = input.inputPositiveInteger();

					// prevents the user from entering wrong option
					if ((option != READ_FROM_KEYBOARD) && (option != READ_FROM_FILE) && (option != PRINT)
							&& (option != EXIT)) {
						throw new Exception();
					}
					// allows to exit the loop upon correct execution of the code
					control = false;

				} catch (Exception e) {
					System.err.println("Wrong option");
				}
			} while (control == true);

			// menu for the user
			switch (option) {
			case READ_FROM_KEYBOARD:
				ReadStudentDetails(input);
				break;
			case READ_FROM_FILE:
				ReadFromFile(input);
				
				break;
			case PRINT:

				PrintStudentDetails();
				break;
			case EXIT:
				System.out.println("Thank You for using the program");
				break;

			}

		} while (option != 4);
	}

}
