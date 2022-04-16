package PRACTICE;

import java.util.Arrays;

public class EX4_14 {
	
public static void main(String[] args) {
		
		//sort double array into asscending order
		
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray :");
		
		for(double value: doubleArray) {
			System.out.printf("%.1f", value);
		}
		
		//filled 10-element arrays with 7s
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		
		displayArray(filledIntArray, "filledIntArray");
		
		//copy array intArray into array intArray2
		int[] intArray = {1,2,3,4,5,6};
		int[] intArraycopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArraycopy, 0, intArray.length);
		
		displayArray(intArraycopy, "intArraycopy");
		
		//compare intArray and intArraycopy for equality
		boolean b = Arrays.equals(intArray, intArraycopy);
		System.out.printf("%n%nintArray &s intArraycopy%n", 
		(b ? "==":"!="));
		
		//compare intArray and filledIntArray for equality
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray &s filledIntArray%n", 
		(b ? "==":"!="));
		
		//search intArray for value 5
		int location = Arrays.binarySearch(intArray, 5);
		
		if(location>=0) {
			System.out.printf("Found 5 at element %d int intArray%n", location);
		}else {
			System.out.println("5 not found in intArray");
		}
		
		//search intArray for value 876
		location = Arrays.binarySearch(intArray, 876);
				
		if(location>=0) {
			System.out.printf("Found 876 at element %d int intArray%n", location);
		}else {
			System.out.println("876 not found in intArray");
		}

	}
	
	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s: ",description);
		for(int value: array) {
			System.out.printf("%d ", value);
		}
	}

}
