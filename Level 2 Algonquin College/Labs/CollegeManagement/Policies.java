package CollegeManagement;
/*
 * Student Name: Karmandeep Singh
 * Lab Professor Name: Karan Kalsi
 * Lab Section Number: 301
 * Due Date: Sunday June 20, 2021
*/

/**
 * This interface declares the max marks as 100 and max gpa as 4.0 and it also declares an abstract method to calculate the gpa
 * @author Karmandeep Singh
 * @version 1.0
 * @since 1.8
 */
public interface Policies {//interface

	/**The max marks as 100**/
	public static final int MAX_MARKS=100; //constant declaration of value 100
	/**Max gpa as 4.0**/
	public static final double MAX_GPA=4.0;//constant declaration of value 4
	
	/**
	 * An abstract method
	 * @param marks The marks of the student that they obtained in their every course
	 */
	public abstract void calculateGpa(double marks[]);//method that accepts a double array 

	
}
