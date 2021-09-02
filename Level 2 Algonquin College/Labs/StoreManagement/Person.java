package StoreManagement;

public class Person {

	protected String firstName;
	protected String lastName;
	protected String email;
	protected long phoneNumber;

	// no arg constructor
	public Person() {

	}

	// parameterized constructor
	public Person(String fName, String lName, String email, long ph) {

		this.firstName = fName;
		this.lastName = lName;
		this.email = email;
		this.phoneNumber = ph;

	}

	// getter for name which combines first name and the last name
	public String getName() {
		return firstName + " " + lastName;
	}

	// getter for email
	public String getEmail() {
		return email;
	}

	// getter for phone number
	public long getPhoneNumber() {
		return phoneNumber;
	}

}// end class
