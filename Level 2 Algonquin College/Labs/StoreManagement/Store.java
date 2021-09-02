package StoreManagement;

public class Store {

	Employee[] emp;
	Input input = new Input();

	// declares an array with employee objects with the array size depending on the
	// user input
	public Store(int numOfEmployees) {
		emp = new Employee[numOfEmployees];
	}

	// creates a menu and populates the employee array depending on the user inputs
	public void readEmployeeDetails() {
		final int REGULAR = 1;
		final int CONTRACTOR = 2;
		int choice = 0;
		
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter the details of the employee " + (i + 1));
			System.out.println("1. Regular");
			System.out.println("2. Contractor");
			System.out.print("Enter type of employee: ");
			choice = input.inputInteger();

			// prevents the user from inputing wrong option
			while (!(choice == REGULAR) && !(choice == CONTRACTOR)) {
				System.out.print("Please input a valid option: ");
				choice = input.inputInteger();
			} // end while loop

			switch (choice) {

			case REGULAR:
				emp[i] = new Regular();
				emp[i].readEmployee();
				break;
			case CONTRACTOR:
				emp[i] = new Contractor();
				emp[i].readEmployee();
				break;
			}// end switch
		} // end for loop
	}// end method

	// prints the details of the employees
	public void printEmployeeDetails() {

		for (int i = 0; i < emp.length; i++) {
			emp[i].printEmployee();
			System.out.println();
		} // end for loop
	}//end method

	// prints out a line of 125 "="
	public static void printLine() {
		for (int i = 0; i < 125; i++) {
			System.out.print("=");
		}//end for loop
	}//end method

	// prints out the name of the store entered by the user
	public static void printTitle(String storeName) {

		printLine();
		System.out.println();
		System.out.printf("%65s", storeName);
		System.out.println();
		printLine();
	}//end method

}// end class
