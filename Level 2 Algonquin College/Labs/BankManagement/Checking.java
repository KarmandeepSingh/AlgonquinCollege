package BankManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * The purpose of this class is to serve as a subclass to the Account class
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 * 
 */
public class Checking extends Account{

	/**Fees charged by the bank**/
	protected double fees;//fees charged by the bank
	
	/**
	 * Initializes the default value of the fees to 13.50
	 */
	public Checking() {
		fees = 13.50;
	}
	
	/**
	 * Deducts the monthly charging fees from the account balance
	 */
	@Override
	public void updateBalance() {
		balance-=fees;
		
		
	}
	
}
