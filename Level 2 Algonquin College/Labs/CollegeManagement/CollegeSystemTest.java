package CollegeManagement;

/**
 * This class contains the main method and it is responsible for executing all appropriate methods 
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
		/**Name of the college**/
		String name;//Name of the college
		Input input=new Input();
		/**Number of students**/
		int nOfStudents;//number of students
		
		
		
		System.out.print("Please enter the name of your College: ");
		name=input.inputFullString();
		
		System.out.print("Please enter the number of students: ");
		nOfStudents=input.inputInteger();
		
		
		College c1=new College(name,nOfStudents);//composition
		
		c1.ReadStudentDetails();
		c1.printTitle();
		c1.printStudentDetails();
		
	}

}
