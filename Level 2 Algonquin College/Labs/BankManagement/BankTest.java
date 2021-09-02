package BankManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday July 11, 2021
*/
/**
 * This class contains the main method and it is responsible for executing all appropriate methods 
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 *
 */

public class BankTest {

	/**
	 * Main method
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		/**Scanner object**/
		Input input = new Input();//scanner object
		/**Name of the bank**/
		String bankName;//name of the bank
		/**Number of accounts**/
		int numberOfAccs;//number of accounts
		/**Option entered by the user in the menu**/
		int action;//option entered by the user in the menu
		/**Constant used in the menu**/
		final int READ_ACCOUNTS = 1;//constant used in the menu
		/**Constant used in the menu**/
		final int RUN_MONTHLY_PROCESS = 2;//constant used in the menu
		/**Constant used in the menu**/
		final int DISPLAY_ACCOUNTS = 3;//Constant used in the menu
		/**Constant used in the menu**/
		final int EXIT = 4;//constant used in the menu

		System.out.print("Please enter the name of the bank: ");
		bankName = input.inputFullString();//inputs the name of the bank

		System.out.print("Please enter number of Account Holders you have: ");
		numberOfAccs = input.inputPositiveInteger();//inputs the number of accounts

		/**Creates a Bank object**/
		Bank b1 = new Bank(bankName, numberOfAccs);//creates a Bank object

		System.out.println("1- Read Accounts");
		System.out.println("2- Run Monthly process");
		System.out.println("3- Display Accounts");
		System.out.println("4- Exit");
		System.out.print("Enter your option: ");
		action = input.inputPositiveInteger();
		
		//prevents the user from entering wrong option
		while(!(action==1) && !(action==2) &&!(action==3) &&!(action==4)) {
			System.out.println("Please enter a valid option");
			System.out.println("1- Read Accounts");
			System.out.println("2- Run Monthly process");
			System.out.println("3- Display Accounts");
			System.out.println("4- Exit");
			System.out.print("Enter your option: ");
			action = input.inputPositiveInteger();
		}
		
		
		while (!(action == EXIT)) { //loop keeps on running until user inputs the appropriate option 
			
			//prevents the user from entering wrong option
			while(!(action==1) && !(action==2) &&!(action==3) &&!(action==4)) {
				System.out.println("Please enter a valid option");
				System.out.println("1- Read Accounts");
				System.out.println("2- Run Monthly process");
				System.out.println("3- Display Accounts");
				System.out.println("4- Exit");
				System.out.print("Enter your option: ");
				action = input.inputPositiveInteger();
			}
			
			switch (action) {
			case READ_ACCOUNTS:
				b1.readAccounts(input);
				System.out.println("1- Read Accounts");
				System.out.println("2- Run Monthly process");
				System.out.println("3- Display Accounts");
				System.out.println("4- Exit");
				System.out.print("Enter your option: ");
				action = input.inputInteger();
				break;

			case RUN_MONTHLY_PROCESS:
				b1.runMonthlyProcess();
				System.out.println("1- Read Accounts");
				System.out.println("2- Run Monthly process");
				System.out.println("3- Display Accounts");
				System.out.println("4- Exit");
				System.out.print("Enter your option: ");
				action = input.inputInteger();
				break;
			case DISPLAY_ACCOUNTS:
				if (!(b1.accounts.size() == 0)) {
					b1.displayAccounts();
				} else {
					System.out.println("_No accounts to display_");
				}
				System.out.println("1- Read Accounts");
				System.out.println("2- Run Monthly process");
				System.out.println("3- Display Accounts");
				System.out.println("4- Exit");
				System.out.print("Enter your option: ");
				action = input.inputInteger();

				break;

			}//end switch

		}//end while loop
		System.out.println("Thank You for using the program");
		System.out.println("Program by Karmandeep Singh");

	}//end main method 

}//end class
