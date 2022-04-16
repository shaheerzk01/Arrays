package PRACTICE;

public class EX4_9 {
	
	public static void main(String[] args) {
		//initailized 3-d array
		int[][][] myarray = { { {1,2,3}, {4,5,6} } , { { 1,4,9},{16,25,36} } , { { 1,8,27}, {64,125,216} } };
		System.out.println("3x2x3 array is given below");
		//print the 3-d array
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<3; k++) {
					System.out.print(myarray[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}


}
