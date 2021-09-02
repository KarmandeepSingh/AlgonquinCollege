package StoreManagement;

//one of the two subclass of the employer sublclass
public class Regular extends Employee {

	private double salary;
	Input input = new Input();

	// inputs user data and assigns it to the fields of the regular object
	@Override
	public void readEmployee() {
		super.readEmployee();// inherits some details from its parent class
		System.out.print("Please enter Employee's annual salary: ");
		salary = input.inputDouble();
		salary /= 12;
	}//end method

	// outputs the regular employee details
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("%20.2f |", salary);// outputs monthly salary

	}//end method

}// end class
