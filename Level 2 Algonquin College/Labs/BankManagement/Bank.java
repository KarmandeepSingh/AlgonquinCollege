package BankManagement;

import java.util.ArrayList;

/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * This class is composition of the Account class and the purpose is to create a
 * type of database of the entries provided by the user
 * 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 */
public class Bank {

	/** Name of the bank account **/
	public static String name;// name of the bank account
	/** List that stores the Account object **/
	ArrayList<Account> accounts;// list that stores the Account object
	/** Constant used for the menu **/
	public static final int CHECKING_ACCOUNT = 1;// constant used for the menu
	/** Constant used for the menu **/
	public static final int SAVINGS_ACCOUNT = 2;// constant used for the menu
	/** The number of the account holders **/
	public int size;// the number of the account holders

	/**
	 * Inputs the name of the bank and the number of account holders in that bank
	 * 
	 * @param name Name of the bank
	 * @param size Number of account holders in that bank
	 */
	public Bank(String name, int size) {
		Bank.name=name;
		this.size=size;
		accounts = new ArrayList<Account>(size);

	}

	/**
	 * Creates a menu and asks the user to enter various details about the account
	 * holders
	 * 
	 * @param input Scanner object
	 */
	public void readAccounts(Input input) {
		
		for (int i = 0; i < size; i++) {
			/** Stores the option entered by the user **/
			int option = 0;
			System.out.println("Please enter Account Type");

			for (int j = 0; j < 50; j++) {// Prints a line of "=" just before each account's details are about to be
											// entered

				System.out.print("=");
			} // end for loop

			System.out.println("\n1 - Checking");
			System.out.println("2 - Savings");
			System.out.print("Please enter option: ");
			option = input.inputInteger();
			// prevents the user from entering wrong option
			while ((!(option == 1) && !(option == 2))) {
				System.out.println("Please enter a valid option");

				System.out.println("1 - Checking");
				System.out.println("2 - Savings");
				System.out.print("Please enter option: ");
				option = input.inputInteger();

			}

			// creates a menu for the user to enter details of the account
			switch (option) {

			case CHECKING_ACCOUNT:
				accounts.add(i, new Checking());
				accounts.get(i).readAccountDetails(input);
				break;

			case SAVINGS_ACCOUNT:
				accounts.add(i, new Savings());
				accounts.get(i).readAccountDetails(input);
				break;

			}

		}
		size=1;
	}

	/**
	 * Executes monthly bank charges or fee deduction depending upon the type of
	 * account
	 */
	public void runMonthlyProcess() {
		if (!(accounts.size() == 0))
			for (int i = 0; i < accounts.size(); i++) {
				accounts.get(i).updateBalance();
			}
		else
			System.out.println("_No accounts to process_");

	}

	/**
	 * Outputs the details of the accounts in a well formatted manner
	 */
	public void displayAccounts() {
		if (!(accounts.size() == 0))
			printTitle();

		{
			String[] title = { "Acc Number", "Name", "Email", "Phone Number", "Balance" };
			System.out.printf("%15s| %25s| %15s| %15s| %15s|", title[0], title[1], title[2], title[3], title[4]);
		}
		System.out.println();
		printStars();

		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).displayAccount();
		}

	}

	/**
	 * Prints out a row of stars
	 */
	public static void printStars() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	/**
	 * Prints the name of the bank in upper case
	 */
	public static void printTitle() {
		printStars();
		System.out.printf("%50s", name.toUpperCase());
		System.out.println();
		printStars();

	}
}
