package BankManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * The purpose of this class is to serve as a superclass to the checking and savings class
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 * 
 */

public abstract class Account{
	
	/**Account number of the person**/
	protected long accNumber;//account number of the person
	/**A person object**/
	Person accHolder=new Person();//a person object
	/**Account balance of the person**/
	protected double balance;//account balance of the person
	
	
	/**
	 * Reads account information and stores in corresponding variables.
	 * @param input Scanner object
	 */
	public void readAccountDetails(Input input) {
		System.out.print("Please enter account number: "); //inputs the account number
		accNumber=input.inputPositiveLong();
		
		accHolder.readPersonDetails(input); //calls the readPersonDetails method from the Person class
		
		System.out.print("Please enter account balance: ");//inputs the account balance 
		balance=input.inputPositiveDouble();
		
	}
	
	/**
	 * Outputs the various attributes of the Account in a formatted manner 
	 */
	public void displayAccount() {
		
		
		System.out.printf("%15d| %25s| %15s| %15d| %15.2f|", accNumber, accHolder.getFullName(), accHolder.emailId, accHolder.phoneNumber, balance);	
		System.out.println();
	}
	
	/**
	 * An abstract method to update balance of the accounts 
	 */
	public abstract void updateBalance();
	
	
	
}
