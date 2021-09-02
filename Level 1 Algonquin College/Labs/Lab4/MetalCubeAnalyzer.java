package Lab4;
public class MetalCubeAnalyzer {
	private double countGoodCubes = 0;
	private double countBadCubes = 0;
	private UserInput input = new UserInput();
	private MetalCube metalCube = new MetalCube();

	public void enterCube() {
		
		System.out.println("Desired cube dimension: 10 X 10 X 10");
		
		System.out.print("Please enter cube length(cm): "); // asks the user for length and sets that value in the														// metal cube object
		metalCube.setLength(input.inputDouble());

		
		System.out.print("Please enter cube height(cm): "); // asks the user for height and sets that value in the
																// metal cube object
		metalCube.setHeight(input.inputDouble());

		
		
		System.out.print("Please enter cube width(cm): "); // asks the user for width and sets that value in the
																// metal cube object
		metalCube.setWidth(input.inputDouble());

		if (metalCube.isWithinTolerance()) { // if the metal cube entered by the user is within the threshold of 1mm the
												// count of good cubes variable is increased by one
			countGoodCubes++;
			
		} else if (!metalCube.isWithinTolerance()) {// if the metal cube entered by the user is not within the threshold of 1mm the
														// count of bad cubes variable is increased by one
			countBadCubes++;
		}

	}

	public void printReport() {
		
		System.out.println("Desired cube dimension: 10 X 10 X 10");
		System.out.println("Total cubes: " + (countGoodCubes + countBadCubes));		// Prints out the counts of good and bad cubes, total cubes,																				
		System.out.println("Good Cubes: " + countGoodCubes);							// percent good cubes, percent bad cubes.
		System.out.println("Bad Cubes: " + countBadCubes);
		System.out.println("Percent Good Cubes: " + (double) (countGoodCubes / (countGoodCubes + countBadCubes)) * 100);
		System.out.println("Percent Bad Cubes: " + (double) (countBadCubes / (countGoodCubes + countBadCubes)) * 100);

	}
}
