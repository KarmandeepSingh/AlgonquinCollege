package Lab1;

import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		//Initiating the class scanner
		Scanner keyboard=new Scanner(System.in);
    
		//Declaring three doubles
		double input1,input2,input3;
    
    //Asking the user for their first input
		System.out.print("Please enter the first number: ");
		input1=keyboard.nextDouble();
    
		//Asking the user for their second input
		System.out.print("Please enter the second number: ");
		input2=keyboard.nextDouble();
    
		//Asking the user for their third input
		System.out.print("Please enter the third number: ");
		input3=keyboard.nextDouble();
    
		//Calculating and Printing the Sum
	  System.out.println("\n1) The sum of the three numbers is: " + (input1+input2+input3));
    
    //Calculating and Printing Average
		System.out.println("\n2) The average of the three numbers is: " + (input1+input2+input3)/3);
    
		//Calculating and Printing Sqaure Root of the sum
		System.out.println("\n3) The square root of sum of the three numbers is: " + Math.sqrt(input1+input2+input3));
    
		//Calculating and Priniting the first number raised to second
		System.out.println("\n4) "+input1 + " raised to " + input2 + " is: " + Math.pow(input1, input2));
    
    //Calculating and Priniting the second number raised to third
		System.out.println("\n5) "+input2 + " raised to " + input3 + " is: " + Math.pow(input2, input3));
    
		//Calculating and Priniting the third number raised to first
		System.out.println("\n6) " + input3 + " raised to " + input1 + " is: " + Math.pow(input3, input1));
    
		//Printing my name
		System.out.println("\nProgram by Karmandeep Singh");
    
		//Closing the scanner 
		keyboard.close();
		}
	    

		                   }
