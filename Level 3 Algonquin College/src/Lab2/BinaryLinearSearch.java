package Lab2;
import java.security.SecureRandom;
import java.util.Arrays;
/**
 * Contains all the methods that perform the linear and binary search recursively and iteratively
 * Student Name: Karmandeep Singh 
 * Student Number: 41025022 
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * @author Karmandeep Singh
 *
 */
public class BinaryLinearSearch {

	/**
	 * Random array generated
	 */
	int[] randomArr;
	/**
	 * Left most element of array used for sorting 
	 */
	int low = 0;
	/**
	 * Right most element of array used for sorting 
	 */
	int high = 29;
	/**
	 * Middle element of array used for sorting 
	 */
	int middle = low + (high - low) / 2;

	/**
	 * Uses Binary search iteratively to find the desired element 
	 * @param randomArr Random array from where the element is to be searched
	 * @param searchKey The element that is to be searched 
	 * @return The index at which the element was found or if it is not found, it returns -1
	 */
	public int iterativeBinarySearch(int[] randomArr, int searchKey) {
		double startTimeNano=System.nanoTime();
		double endTimeNano;
		double timeDiffNano;
		
		double startTimeMili=System.currentTimeMillis();
		double endTimeMili;
		double timeDiffMili;
		this.randomArr = randomArr;
		low=0;
		high=29;

		while (low <= high) {

			int middle = low + (high - low) / 2;
			if (searchKey < randomArr[middle]) {
				high = middle - 1;
				remainingElements(randomArr, low, high);
			} else if (searchKey > randomArr[middle]) {
				low = middle + 1;
				remainingElements(randomArr, low, high);
			} else {
				System.out.println(randomArr[middle]);
				
				
				System.out.printf("Number %d found at index %d: Iterative Binary Search%n", searchKey, middle);
				endTimeNano=System.nanoTime();
				endTimeMili=System.currentTimeMillis();
				
				timeDiffNano=endTimeNano-startTimeNano;
				timeDiffMili=endTimeMili-startTimeMili;
				System.out.println("Time taken in nanoseconds: "+timeDiffNano);
				
				System.out.println("Time taken in miliseconds: "+timeDiffMili);
				return middle;
			}
		}
		endTimeNano=System.nanoTime();
		endTimeMili=System.currentTimeMillis();
		
		timeDiffNano=endTimeNano-startTimeNano;
		timeDiffMili=endTimeMili-startTimeMili;
		System.out.println("Time taken in nanoseconds: "+timeDiffNano);
		
		System.out.println("Time taken in miliseconds: "+timeDiffMili);
		System.out.printf("Number %d was not found: Iterative Binary Search", searchKey);
		return -1;

	}

	/**
	 * Uses Binary search recursively to find the desired element 
	 * @param randomArr Random array from where the element is to be searched
	 * @param left Left most element of the array or sub array 
	 * @param right Right most element of the array or sub array
	 * @param searchKey The element that is to be searched 
	 * @return The index at which the element was found or if it is not found, it returns -1
	 */
	public int recursiveBinarySearch(int[] randomArr, int left, int right, int searchKey) {
		double startTimeNano=System.nanoTime();
		double endTimeNano;
		double timeDiffNano;
		
		double startTimeMili=System.currentTimeMillis();
		double endTimeMili;
		double timeDiffMili;
		
		
		this.randomArr = randomArr;
		if (left <= right) {
			middle = left + (right - left) / 2;

			if (searchKey == randomArr[middle]) {
				System.out.println(randomArr[middle]);
				
				
				System.out.printf("Number %d found at index %d: recursive Binary Search%n", searchKey, middle);
				endTimeNano=System.nanoTime();
				endTimeMili=System.currentTimeMillis();
				
				timeDiffNano=endTimeNano-startTimeNano;
				timeDiffMili=endTimeMili-startTimeMili;
				System.out.println("Time taken in nanoseconds: "+timeDiffNano);
				
				System.out.println("Time taken in miliseconds: "+timeDiffMili);
				return middle;
			} else if (searchKey < randomArr[middle]) {
				remainingElements(randomArr, left, middle - 1);
				return recursiveBinarySearch(randomArr, left, middle - 1, searchKey);
			} else if (searchKey > randomArr[middle]) {
				remainingElements(randomArr, middle + 1, right);
				return recursiveBinarySearch(randomArr, middle + 1, right, searchKey);
			}
		}
		
		System.out.printf("Number %d found was not found: recursive binary search%n", searchKey);
		endTimeNano=System.nanoTime();
		endTimeMili=System.currentTimeMillis();
		
		timeDiffNano=endTimeNano-startTimeNano;
		timeDiffMili=endTimeMili-startTimeMili;
		System.out.println("Time taken in nanoseconds: "+timeDiffNano);
		
		System.out.println("Time taken in miliseconds: "+timeDiffMili);
		return -1;

	}

	/**
	 * Generates a random array ranging from 10-100
	 * @return Randomly generated array
	 */
	public int[] generateRandomInts() {
		SecureRandom rand = new SecureRandom();

		randomArr = new int[30];

		for (int i = 0; i < 30; i++) {
			randomArr[i] = 11 + rand.nextInt(89);

		}
		
		System.out.println("Unsorted array: "+Arrays.toString(randomArr));

		int temp;
		for (int i = 0; i < randomArr.length; i++) {
			for (int j = i; j < randomArr.length; j++) {
				if (randomArr[i] > randomArr[j]) {
					temp = randomArr[i];
					randomArr[i] = randomArr[j];
					randomArr[j] = temp;
				}
			}
		}

		return randomArr;

	}

	/**
	 * Prints out the sub array of the array
	 * @param array Array that is to be printed 
	 * @param low The starting index of the sub array
	 * @param high The ending index of the sub array
	 */
	public void remainingElements(int[] array, int low, int high) {
		for (int i = low; i <=high; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Uses Linear search iteratively to find the desired element 
	 * @param randomArr Random array from where the element is to be searched
	 * @param searchKey The desired element
	 * @return The index at which the element was found or if it is not found, it returns -1
	 */
	public int iterativeLinearSearch(int[] randomArr, int searchKey) {
		double startTimeNano=System.nanoTime();
		double endTimeNano;
		double timeDiffNano;
		
		double startTimeMili=System.currentTimeMillis();
		double endTimeMili;
		double timeDiffMili;
		this.randomArr = randomArr;
		for (int i = 0; i < randomArr.length; i++) {
			if (randomArr[i] == searchKey) {
				
				System.out.printf("Number %d found at index %d: Iterative Linear Search%n", searchKey, i);
				endTimeNano=System.nanoTime();
				endTimeMili=System.currentTimeMillis();
				
				timeDiffNano=endTimeNano-startTimeNano;
				timeDiffMili=endTimeMili-startTimeMili;
				System.out.println("Time taken in nanoseconds: "+timeDiffNano);
				
				System.out.println("Time taken in miliseconds: "+timeDiffMili);
				return i;
			}

		}
		
		System.out.printf("Number %d was not found: iterative linear search%n", searchKey);
		endTimeNano=System.nanoTime();
		endTimeMili=System.currentTimeMillis();
		
		timeDiffNano=endTimeNano-startTimeNano;
		timeDiffMili=endTimeMili-startTimeMili;
		System.out.println("Time taken in nanoseconds: "+timeDiffNano);
		
		System.out.println("Time taken in miliseconds: "+timeDiffMili);
		return -1;
	}

	/**
	 * Uses Linear search recursively to find the desired element 
	 * @param randomArr Random array from where the element is to be searched
	 * @param high The right most element of the array
	 * @param searchKey The desired element
	 * @return The index at which the element was found or if it is not found, it returns -1
	 */
	public int recursiveLinearSearch(int[] randomArr, int high, int searchKey) {
		double startTimeNano=System.nanoTime();
		double endTimeNano;
		double timeDiffNano;
		
		double startTimeMili=System.currentTimeMillis();
		double endTimeMili;
		double timeDiffMili;
		this.randomArr = randomArr;
		int result;

		if (high < low) {
			
			System.out.printf("Number %d was not found:recursive Linear Search%n", searchKey);
			endTimeNano=System.nanoTime();
			endTimeMili=System.currentTimeMillis();
			
			timeDiffNano=endTimeNano-startTimeNano;
			timeDiffMili=endTimeMili-startTimeMili;
			System.out.println("Time taken in nanoseconds: "+timeDiffNano);
			
			System.out.println("Time taken in miliseconds: "+timeDiffMili);
			return -1;
		}
		if (randomArr[low] == searchKey) {
			result=low;
			low=0;
			
			System.out.printf("Number %d found at index %d:recursive Linear Search%n", searchKey, result);
			endTimeNano=System.nanoTime();
			endTimeMili=System.currentTimeMillis();
			
			timeDiffNano=endTimeNano-startTimeNano;
			timeDiffMili=endTimeMili-startTimeMili;
			System.out.println("Time taken in nanoseconds: "+timeDiffNano);
			
			System.out.println("Time taken in miliseconds: "+timeDiffMili);
			return result;
		}
		low++;
		return recursiveLinearSearch(randomArr, high, searchKey);

	}
	

}
