package Lab3;

/*
 * This class has three fields: test, target, epsilon as doubles, and has
 * two public methods to generate reports on comparing with equality
 * operator (==), versus epsilon with Math.abs(target - test) <= epsilon.
 */
public class EpsilonTester {
	private double test; // test number
	private double target; // target number
	private double epsilon; // value for epsilon

	/*
	 * Sets test, target, and epsilon all to zero
	 */
	public EpsilonTester() {
		this(0.0, 0.0, 0.0);
	}

	/*
	 * Sets test, target and epsilon with the passed arguments.
	 */
	public EpsilonTester(double test, double target, double epsilon) {
		setTest(test);
		setTarget(target);
		setEpsilon(epsilon);
	}

	/* accessor for test field */
	public double getTest() {
		return test;
	}

	/* mutator for test field */
	public void setTest(double test) {
		this.test = test;
	}

	/* accessor for target field */
	public double getTarget() {
		return target;
	}

	/* mutator for target field */
	public void setTarget(double target) {
		this.target = target;
	}

	/* accessor for epsilon field */
	public double getEpsilon() {
		return epsilon;
	}

	/* mutator for epsilon field */
	public void setEpsilon(double epsilon) {
		this.epsilon = epsilon;
	}

	/*
	 * Produces a report detailing the comparison of target and test numbers
	 * directly with the equality operator.
	 */
	public String compareWithEquality() {
		boolean result = test == target;
		String report = generateReport("Testing with: target == test", result);
		return report;
	}
	
	/*
	 * Produces a report detailing the comparison of target and test numbers
	 * using the difference of the target and test versus epsilon.
	 */
	public String compareWithEpsilon() {
		boolean result = Math.abs(target - test) <= epsilon;
		String header = String.format(
				"Testing with: Math.abs(target - test) <= epsilon%n"
				+ "value of epsilon is: %.14f", epsilon);
		String report = generateReport(header, result);
		return report;
	}
	
	/*
	 * This method interacts with a user at a console window
	 * to prompt for, and accept values for the fields.
	 * Inputs are assigned to the fields immediately.
	 */
	public void interactWithUserForFieldValues() {
		double value = 0; // used for target, test, epsilon in sequence
		
		System.out.print("Enter target number: ");
		value = User.inputDouble();
		setTarget(value);

		System.out.print("Enter test number: ");
		value = User.inputDouble();
		setTest(value);

		System.out.print("Enter epsilon e.g. 1E-1 to 1E-14: ");
		value = User.inputDouble();
		setEpsilon(value);
	}
	
	/*
	 * This method generates a report based on the header-line, and a
	 * boolean value representing the result of a comparison.
	 * 
	 * Reminder when using either:
	 *     printf(formatString, data_1, ... , data_n) 
	 *     String.format(formatString, data_1, ... , data_n)
	 * %f is for float or double, %.14f means show 14 decimal places 
	 * %b is for boolean                                             
	 * %n is for newline                                             
	 * %d is for integers (not used here)  
	 * %s is for String,                     
	 */
	private String generateReport(String header, boolean result) {
		String report = header;
		report += String.format("%n");
		report += String.format("%s %.14f%n", "test number: ",test);
		report += String.format("%s %.14f%n", "target number: ", target);
		report += String.format("%s %.14f%n", 
				"absolute difference: ", Math.abs(target - test));
		report += String.format("Considered equal?: %b",result);
		return report;
	}
}
