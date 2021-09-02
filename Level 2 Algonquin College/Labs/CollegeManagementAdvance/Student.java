package CollegeManagementAdvance;

import java.util.ArrayList;
import java.util.UnknownFormatConversionException;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 26, 2021
*/

/**
 * The purpose of this class is to define the various properties of a student
 * This class is a subclass of Person class I This class implements the
 * interface Policies This class will be extended by FulltimeStudent and
 * ParttimeStudent classes
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */

public class Student extends Person implements Policies { // this class is a subclass of Person class and also
															// implements the interface Policies

	/** The student number of the student **/
	protected int studentNumber; // stores the student number of the student
	/** The program name of the student is registered in **/
	protected String programName; // stores the program name of the student is registered in
	/** The gpa of the student **/
	protected double gpa; // stores the gpa of the student
	/** Number of courses the student has been enrolled in **/
	protected int numberOfCourses; // Number of courses the student has been enrolled in

	/**
	 * No arg constructor for the student class
	 */
	Student() {// no arg constructor

	};

	/**
	 * Parameterized constructor for the student class
	 * 
	 * @param p         Inherits attributes from the superclass Person
	 * @param studentNo The student number of the student
	 * @param progName  The program name of the student is registered in
	 * @param gpa       The gpa of the student
	 */
	Student(Person p, int studentNo, String progName, double gpa) { // parameterized constructor
		this.studentNumber = studentNo;
		this.programName = progName;
		this.gpa = gpa;
	}

	/**
	 * Asks the user for information about the student and upon user's answer it
	 * then stores that information in appropriate instance variables
	 */
	@Override
	public void readInfo(Input input) { // this method asks the user for information about the student and upon user's
		// answer it then stores that information in previously declared instance
		// variable
		System.out.print("Please enter student's program name: "); // user is asked for their program name
		programName = input.inputString(); // program name is stored in the appropriate variable

		System.out.print("Please enter student number: "); // user is asked for their student number
		studentNumber = input.inputPositiveInteger(); // student number is stored in the appropriate variable

		System.out.print("Please enter student's first name: ");// user is asked for their first name
		firstName = input.inputString();// first name is stored in the appropriate variable

		System.out.print("Please enter student's last name: ");// user is asked for their last name
		lastName = input.inputString();// last name is stored in the appropriate variable

		System.out.print("Please enter student's email id: ");// user is asked for their email id
		emailId = input.inputString();// email id is stored in the appropriate variable

		System.out.print("Please enter student's phone number: ");// user is asked for their phone number
		phoneNumber = input.inputPositiveLong();// phone number is stored in the appropriate variable

		readMarks(input); // readMarks method is called
	}

	/**
	 * Asks the user for the number of courses a student has been registered in and
	 * then asks them to enter marks which the student achieved in each course
	 * 
	 * @param input Uses scanner from the Input class to take input from the user
	 */

	private void readMarks(Input input) {

		System.out.print("Please enter the number of courses: "); // asks for the number of courses

		numberOfCourses = input.inputPositiveInteger();
		double tempMarks; // temporary integer to check the validity of marks
		/** Marks obtained by the student in each course **/
		ArrayList<Double> marks = new ArrayList<Double>();
		try {
			for (int i = 0; i < numberOfCourses; i++) { // Asks the user to to enter marks of each course and stores
														// them in
														// the array
				boolean control = true;
				do {
					try {
						System.out.printf("Please enter the marks for your course %d :", (i + 1));
						tempMarks = input.inputDouble();
						if (tempMarks < 0 || tempMarks > 100) {
							throw new Exception();
						}
						control = false;
						marks.add(tempMarks);
					} catch (Exception e) {
						System.out.println("Please enter valid marks (0-100)");
					}

				} while (control == true);
			} // end for loop
		} catch (NullPointerException npe) {
			System.out.println(npe);
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe);
		} catch (Exception e) {
			e.printStackTrace();
		}
		calculateGpa(marks); // calls the calculateGpa method
	}// end method

	/**
	 * Implements the calculateGpa method from the interface Policies and calculates
	 * the gpa using the formula
	 * 
	 * @param marks Stores marks of the achieved in each course
	 */
	@Override
	public void calculateGpa(ArrayList<Double> marks) {
		/** Adds the marks from all the couses **/
		double totalMarksObtained = 0;
		try {

			for (int i = 0; i < marks.size(); i++) { // Calculates the total marks from all courses
				totalMarksObtained += marks.get(i);
			}
		} catch (IndexOutOfBoundsException ibe) {
			System.out.println(ibe);
		} catch (NullPointerException npe) {
			System.out.println(npe);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			gpa = (totalMarksObtained / (numberOfCourses * MAX_MARKS)) * MAX_GPA; // calculates the gpa
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (UnknownFormatConversionException ufce) {
			System.out.println(ufce);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Prints the actual values obtained from the readInfo method
	 */
	@Override
	public void printInfo() {
		/** Concatenates the first name and the last name into full name **/
		String fullName = firstName + " " + lastName;

		System.out.printf("%7s| %8d| %25s| %25s| %15d| %7.2f| ", programName, studentNumber, fullName, emailId,
				phoneNumber, gpa);

	}

}
