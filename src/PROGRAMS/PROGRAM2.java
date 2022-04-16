package PROGRAMS;

import java.util.ArrayList;
import java.util.List;


public class PROGRAM2 {
	
public static void main(String[] args) {
		
		int[][]matrix = {{1,2,3},{2,4,6},{6,2,9}};
		
		System.out.println("Matrix 1");
		List<Integer> flatArray = new ArrayList();
	    for (int[] row : matrix) {
	        for (int col : row) {
	            flatArray.add(col);
	        }
	    }
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int max = matrix[0][0];
		int min = matrix[0][0];
		int duplicate_count = 0;
		for(int i=0;i<matrix.length;i++) {
			boolean dupFound = false;
			for(int j=0;j<matrix[i].length;j++) {
					if(max<matrix[i][j]) {
						max = matrix[i][j];
					}else if(min>matrix[i][j]) {
						min = matrix[i][j];
					}else if(flatArray.get(i) == flatArray.get(j)) {
		                dupFound = true;
					
				}
			}
			if(dupFound) {
				duplicate_count+=1;
			}
		}
		System.out.println("largest number " + max + " smallest number " + min +  " equal number " + duplicate_count + "\n");
		
		int[][] matrix2 = {{4,6,2},{2,6,5},{1,8,7}};
		
		System.out.println("matrix2\n");
		
		List<Integer> flatArray2 = new ArrayList();
	    for (int[] row : matrix2) {
	        for (int col : row) {
	            flatArray2.add(col);
	        }
	    }
		
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		int max2 = matrix2[0][0];
		int min2 = matrix2[0][0];
		duplicate_count = 0;
		for(int i=0; i<matrix2.length; i++) {
			boolean dupFound = false;
			for(int j=0; j<matrix2[i].length; j++) {
				if(max2<matrix2[i][j]) {
					max2 = matrix2[i][j];
				}else if(min2>matrix2[i][j]) {
					min2 = matrix2[i][j];
				}else if(flatArray2.get(i) == flatArray2.get(j)) {
	                dupFound = true;
				}
			}
			if(dupFound) {
				duplicate_count+=1;
			}
		}
		
		System.out.println("\nlargest number " + max2 + " smallest number " + min2 +  " equal number " + duplicate_count + "\n");
		
        int[][] matrix3 = {{12,54,67},{78,20,34},{12,79,90}};
		
		System.out.println("matrix3\n");
		
		List<Integer> flatArray3 = new ArrayList();
	    for (int[] row : matrix3) {
	        for (int col : row) {
	            flatArray3.add(col);
	        }
	    }
		
		for(int i=0; i<matrix3.length; i++) {
			for(int j=0; j<matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		int max3 = matrix3[0][0];
		int min3 = matrix3[0][0];
		duplicate_count= 0;
		for(int i=0; i<matrix3.length; i++) {
			boolean dupFound = false;
			for(int j=0; j<matrix3[i].length; j++) {
				if(max3<matrix3[i][j]) {
					max3 = matrix3[i][j];
				}else if(min3>matrix3[i][j]) {
					min3 = matrix3[i][j];
				}else if(flatArray3.get(i) == flatArray3.get(j)) {
	                dupFound = true;
				}
			}
			if(dupFound) {
				duplicate_count+=1;
			}
		}
		
		System.out.println("\nlargest number " + max3 + " smallest number " + min3 +  " equal number " + duplicate_count + "\n");

	}


}
