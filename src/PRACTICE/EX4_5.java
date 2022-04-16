package PRACTICE;

public class EX4_5 {
	
public static void main(String[] args) {
		
		//two dimension array definition
		
		int[][] intArray = new int[3][3];
		//printing 2-d array
		System.out.println("The two-dimensional array:");
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				intArray[i][j] = i*j;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

	}


}
