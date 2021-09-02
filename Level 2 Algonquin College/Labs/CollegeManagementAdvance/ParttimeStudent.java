package CollegeManagementAdvance;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 26, 2021
*/
/**
 * The purpose of this class is to extend the Student superclass and provide the
 * user with more options to define the properties of the student
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */
public class ParttimeStudent extends Student {

	/** Total Fees of the couse **/
	private double courseFeesTotal; // Total Fees of the couse
	/** Total credits of the course **/
	private double credits;// Total credits of the course

	/**
	 * No arg constructor 
	 */
	public ParttimeStudent() {
		
	}
	/**
	 * Parameterized constructor
	 * @param studentNumber Student number 
	 * @param fName First name of the student 
	 * @param lName Last name of the student
	 * @param email Email of the student 
	 * @param ph Phone number of the student
	 * @param programName Program name 
	 * @param gpa Gpa of the student 
	 * @param totalCourseFees Total course fees 
	 * @param credits Credits of the student
	 */
	public ParttimeStudent(int studentNumber, String fName, String lName, String email, long ph, String programName, double gpa, double totalCourseFees, double credits) {
		super.studentNumber=studentNumber;
		super.firstName=fName;
		super.lastName=lName;
		super.emailId=email;
		super.phoneNumber=ph;
		super.programName=programName;
		super.gpa=gpa;
		this.courseFeesTotal=totalCourseFees;
		this.credits=credits;
	}
	
	
	
	/**
	 * Asks the user for information about the student and upon user's answer it
	 * then stores that information in appropriate instance variables
	 */
	@Override
	public void readInfo(Input input) {
		super.readInfo(input);// inheritance

		System.out.print("Please enter total course fees: ");
		courseFeesTotal = input.inputPositiveDouble();

		System.out.print("Please enter credit hours: ");
		credits = input.inputPositiveDouble();
	}

	/**
	 * Prints the actual values obtained from the readInfo method
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("%12.2f| %8.2f|", courseFeesTotal, credits);
	}	
}
