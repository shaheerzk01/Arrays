package PRACTICE;

public class EX4_3 {
	
	public static void main(String[] args) {
		//declare an array of int
		
		int[][] intArray = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				intArray[i][j] = i+1;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
