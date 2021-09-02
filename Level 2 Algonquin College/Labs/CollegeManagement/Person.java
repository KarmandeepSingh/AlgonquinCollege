package CollegeManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday June 20, 2021
*/
/**
 * The purpose of this class is to define basic qualities of a person.
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 * 
 */
public abstract class Person {

	
	/**The first name of the student **/
	protected String firstName; //stores the first name of the student 
	/**The last name of the student **/
	protected String lastName; //stores the last name of the student
	/**The email of the student **/
	protected String emailId; //stores the email of the student 
	/**The phone number of the student **/
	protected long phoneNumber; //stores the phone number of the student
	
	
	/**
	 * No arg constructor for the person class
	 * 
	 */
	
	//no arg constructor 
	Person(){
		
	}
	
	/**
	 * Parameterized constructor for the person class
	 * @param fName First Name of the person
	 * @param lName The last name of the person
	 * @param email The email of the person 
	 * @param ph 	The phone number of the person
	 */
	
	
	//parameterized constructor
	Person(String fName,String lName,String email ,long ph){
		this.firstName=fName;
		this.lastName=lName;
		this.emailId=email;
		this.phoneNumber=ph;
		
	}
	
	/**
	 * Reads details of the person
	 */
	public abstract void readInfo(); //declaring method readInfo
	/**
	 * Prints details of the person
	 */
	public abstract void printInfo();//declaring method printInfo
	
	
	
}
