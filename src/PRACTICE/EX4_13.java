package PRACTICE;

import java.util.Arrays;

public class EX4_13 {
	
public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		System.out.printf("Effect of passing reference to entrie array:%n" + 
		"The values of the orignal array are:%n");
		
		for(int value:array) {
			System.out.printf("  %d  ", value);
		}
		
		modifyArray(array);
		System.out.printf("%n%nThe values of the modified array are:%n");
		
		for(int value:array) {
			System.out.printf("  %d  ", value);
		}
		
		System.out.printf("%n%nEffects of passing array element value:%n" + 
		"array[3] before modifyElement:%d%n", array[3]);
		
		modifyElement(array[3]);
		System.out.printf("array[3] after modifyElement: %d%n", array[3]);

	}
	private static void modifyElement(int i) {
		
		
	}
	public static void modifyArray(int[] array2) {
		for (int counter=0; counter<array2.length;counter++) {
			array2[counter] *=2;
		}
	}


}
