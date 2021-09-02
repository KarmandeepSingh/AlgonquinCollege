package CollegeManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday June 20, 2021
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
	Student[] students;// instantiating an array of student object
	Input input = new Input();

	/** Option 1 as Full time Student **/
	final static int FULLTIME_STUDENT = 1;
	/** Option 2 as Part time Student **/
	final static int PARTTIME_STUDENT = 2;

	/**
	 * Parameterized Constructor
	 * 
	 * @param collegeName   Name of the student's college
	 * @param totalStudents Number of students and is used to create the student
	 *                      array of appropriate size
	 */
	College(String collegeName, int totalStudents) {
		this.collegeName = collegeName;
		students = new Student[totalStudents];
	}

	/**
	 * Prints the title and the header row of the output
	 */
	public void printTitle() {

		for (int i = 0; i < 122; i++) { // prints a line of stars to highlight the title
			System.out.print("*");
		} // end for loop
		System.out.println();
		System.out.printf("%57s  - List of Students%n", collegeName);
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
			for (int i = 0; i < 122; i++) { // prints a line of stars to highlight the title
				System.out.print("*");
			} // end for loop
			System.out.println();
		}

	}

	/**
	 * Provides the user with an option to enter the student type as part time or
	 * full time and then performs other appropriate methods accordingly
	 */
	public void ReadStudentDetails() {
		for (int i = 0; i < students.length; i++) {// asks the user for each student's details
			/** Stores the option entered by the user **/
			int option = 0;
			System.out.printf("Please enter details of student %d", (i + 1));
			System.out.println();
			for (int j = 0; j < 50; j++) {// Prints a line of "=" just before each student's details are about to be
											// entered

				System.out.print("=");
			} // end for loop

			System.out.println("\n1 - Fulltime student");
			System.out.println("2 - Parttime student");
			System.out.print("Please enter Student type: ");
			option = input.inputInteger();
			// prevents the user from entering wrong option
			while ((!(option == 1) && !(option == 2))) {
				System.out.println("Please enter a valid option");

				System.out.println("1 - Fulltime student");
				System.out.println("2 - Parttime student");
				System.out.print("Please enter Student type: ");
				option = input.inputInteger();

			}

			// creates a menu for the user to enter details of the student
			switch (option) {

			case FULLTIME_STUDENT:
				students[i] = new FulltimeStudent();
				students[i].readInfo();
				break;

			case PARTTIME_STUDENT:
				students[i] = new ParttimeStudent();
				students[i].readInfo();
				break;

			}

		}

	}

	/**
	 * Calls printInfo method from other classes to print the final and properly
	 * formatted details of the students
	 */
	public void printStudentDetails() {
		for (int i = 0; i < students.length; i++) {
			students[i].printInfo();
			System.out.println();
		}
	}

}
