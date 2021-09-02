package BankManagement;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * The purpose of this class is to define basic qualities of a person.
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 * 
 */
public class Person {

	//Input input=new Input();
	/**The first name of the person **/
	private String firstName; //stores the first name of the person 
	/**The last name of the person **/
	private String lastName; //stores the last name of the person
	/**The email of the person **/
	protected String emailId; //stores the email of the person 
	/**The phone number of the person **/
	protected long phoneNumber; //stores the phone number of the person
	
	
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
	 * Concatenates the first name and the last name
	 * @return full name of the person
	 */
	
	public String getFullName() {
		String fullName= firstName + " " + lastName;
		return fullName;
	}
	
	/**
	 * Returns the email of the person
	 * @return email id of the person
	 */
	public String getEmail() {
		return emailId;
	}
	
	/**
	 * Returns the phone number of the person
	 * @return phone number of the person
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	

	/**
	 *  Reads personal information and stores in corresponding variables.
	 * @param input Scanner object
	 */
	public void readPersonDetails(Input input) {
		//this.input=Input;
		System.out.print("Please enter first name: ");
		firstName=input.inputString();
		
		System.out.print("Please enter last name: ");
		lastName=input.inputString();
		
		System.out.print("Please enter email id: ");
		emailId=input.inputString();
		
		System.out.print("Please enter the phone number: ");
		phoneNumber=input.inputPositiveLong();
	}
	
	
	
	
}
