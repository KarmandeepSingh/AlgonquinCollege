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
public class Savings extends Account{
	/**yearly interest rate that would be added to the account balance of the person**/
	protected double fees;//interest that would be added to the account balance of the person
	
	/**
	 * Initializes the default value of the interest rate to 3.99
	 */
	public Savings() {
		fees=3.99;
	}
	
	/**
	 * Adds the monthly interest using the appropriate formula to the account balance
	 */
	@Override
	public void updateBalance() {
		
		balance+=balance * (( fees / 12 )/100);

		
		
	}
	
	
	
	
}
