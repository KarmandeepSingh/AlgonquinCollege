package CollegeManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday June 20, 2021
*/
/**
 * The purpose of this class is to extend the Student superclass and provide the
 * user with more options to define the properties of the student
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */
public class FulltimeStudent extends Student{
	
	/**Total tution fees**/
	private double tutionFees;//total tution fees
	Input input =new Input();
	
	/**
	 * Asks the user for information about the student and upon user's answer it
	 * then stores that information in appropriate instance variables
	 */
	@Override
	public void readInfo() {
		super.readInfo();
		System.out.print("Please enter tution fees: ");
		tutionFees=input.inputDouble();
		
	}
	
	/**
	 * Prints the actual values obtained from the readInfo method
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		String credits="NA"; //Instead of leaving the credits column empty, "NA" is displayed
		System.out.printf("%12.2f| %8s| ", tutionFees, credits);
	}
	

}
