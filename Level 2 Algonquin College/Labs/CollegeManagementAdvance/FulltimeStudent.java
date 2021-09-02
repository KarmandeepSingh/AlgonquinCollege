package CollegeManagementAdvance;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday June 20, 2021
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
public class FulltimeStudent extends Student {

	/** Total tution fees **/
	private double tuitionFees;// total tution fees

	/**
	 * No arg constructor
	 */
	public FulltimeStudent() {
		
	}
	/**
	 * Parameterized constructor 
	 * @param studentNum Student number
	 * @param fName First name of the student 
	 * @param lName Last name of the student
	 * @param email Email of the student 
	 * @param ph Phone number of the student 
	 * @param programName Program name 
	 * @param gpa Gpa of the student 
	 * @param tuitionFees Tution fees of the student
	 */
	public FulltimeStudent(int studentNum, String fName, String lName, String email, long ph, String programName, double gpa, double tuitionFees) {
		super.studentNumber=studentNum;
		super.firstName=fName;
		super.lastName=lName;
		super.emailId=email;
		super.phoneNumber=ph;
		super.programName=programName;
		super.gpa=gpa;
		this.tuitionFees=tuitionFees;
	}
	

	
	/**
	 * Asks the user for information about the student and upon user's answer it
	 * then stores that information in appropriate instance variables
	 */
	@Override
	public void readInfo(Input input) {
		super.readInfo(input);
		System.out.print("Please enter tuition fees: ");
		tuitionFees = input.inputPositiveDouble();

	}

	/**
	 * Prints the actual values obtained from the readInfo method
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		String credits = "NA"; // Instead of leaving the credits column empty, "NA" is displayed
		System.out.printf("%12.2f| %8s| ", tuitionFees, credits);
	}


	
	
}
