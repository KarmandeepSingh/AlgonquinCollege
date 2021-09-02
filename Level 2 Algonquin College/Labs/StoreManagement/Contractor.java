package StoreManagement;

//one of the two subclass of the employer class
public class Contractor extends Employee {

	private double hourlyRate;
	private double numHours;
	Input input = new Input();

	// inputs user data and assigns it to the fields of the contractor object
	@Override
	public void readEmployee() {
		super.readEmployee(); // inherits some details from it's parent class
		System.out.print("Please enter Employee's hourly rates: ");
		hourlyRate = input.inputDouble();

		System.out.print("Please enter Employee's number of hours worked: ");
		numHours = input.inputDouble();
	}//end method

	// outputs the contractor employee details
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("%20.2f |", hourlyRate * numHours); // outputs monthly income

	}//end method

}// end class
