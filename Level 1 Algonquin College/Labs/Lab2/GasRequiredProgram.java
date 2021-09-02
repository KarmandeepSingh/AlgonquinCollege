package Lab2;

import java.util.Scanner;
public class GasRequiredProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		GasRequired gas1=new GasRequired();		//initiating default constructor 
		
		System.out.print("Enter mileage(in L/100km): ");	//using the scanner to record milage in the constructor
		double milage = scan.nextDouble();
		gas1.setMilage(milage);
		
		System.out.print("Enter distance(in km): ");		//using the scanner to record distance in the constructor
		double distance=scan.nextDouble();
		gas1.setDistance(distance);
		
		gas1.CalculateGasRequired();	//using this method and the recorded data to calculate the gas required
		
		System.out.println();
		
		System.out.printf("Mileage is: %.1fL/100km", gas1.getMilage());
		System.out.println();
		System.out.printf("Distance is: %.0fkm", gas1.getDistance());
		System.out.println();
		System.out.printf("Gas required is: %.0fL", gas1.getGasRequired());
		System.out.println();
		System.out.println("Program by Karmandeep Singh");
		
		scan.close();
	}

}
