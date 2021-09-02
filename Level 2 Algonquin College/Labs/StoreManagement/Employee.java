package StoreManagement;

//superclass
public class Employee {

	private int employeeNumber;
	private Person emp = new Person();
	Input input = new Input();

	// no arg constructor
	public Employee() {

	}

	// parameterized constructor
	public Employee(int empNumber, Person p) {
		this.emp = p;
		this.employeeNumber = empNumber;
	}

	// inputs user data and assigns it to the fields of the employee object
	public void readEmployee() {

		System.out.print("Please enter Employee's employee number: ");
		employeeNumber = input.inputInteger();

		System.out.print("Please enter Employee's first name: ");
		emp.firstName = input.inputString();

		System.out.print("Please enter Employee's last name: ");
		emp.lastName = input.inputString();

		System.out.print("Please enter Employee's email: ");
		emp.email = input.inputString();

		System.out.print("Please enter Employee's phone number: ");
		emp.phoneNumber = input.inputLong();

	}//end method

	// outputs the employee details
	public void printEmployee() {
		System.out.printf("%10d |", employeeNumber);
		System.out.printf("%30s |", emp.getName());
		System.out.printf("%35s |", emp.getEmail());
		System.out.printf("%20d |", emp.getPhoneNumber());

	}//end method

}// end class
