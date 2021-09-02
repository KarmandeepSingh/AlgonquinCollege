package StoreManagement;

//class which contains the main method and executes the program
public class Lab2 {

	public static void main(String[] args) {
		String storeName;
		int num;
		Input input = new Input();
		
		
		System.out.print("Please enter the name of the store: ");
		storeName = input.inputFullString();
		
		
		System.out.print("Please enter the number of employees you have: ");
		num = input.inputInteger();

		Store store = new Store(num);
		store.readEmployeeDetails();

		Store.printTitle(storeName);

		System.out.println();

		// prints out the table header
		{
			String emp = "Emp#";
			String n = "Name";
			String e = "Email";
			String p = "Phone";
			String s = "Salary";
			System.out.printf("%10s |%30s |%35s |%20s |%20s |", emp, n, e, p, s);
		}

		System.out.println();
		Store.printLine();
		System.out.println();
		store.printEmployeeDetails();

	}// end main method

}// end class
