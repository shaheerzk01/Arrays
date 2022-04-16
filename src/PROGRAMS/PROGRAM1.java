package PROGRAMS;

public class PROGRAM1 {
	
    public static void main(String[] args) {
		
	int[][] matrix1 = {
			{1,4,5}, 
			{3,3,4},
			{3,6,8}
	};
	
	int[][] matrix2 = {
			{2,6,5},
			{4,6,2},
			{8,2,4}
	};
	
	int[][] matrix = new int[3][3];
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			matrix[i][j] = 0;
			for(int k=0;k<3;k++) {
				matrix[i][j] += matrix1[i][k] * matrix2[k][j];
		    }
			System.out.print(matrix[i][j] + " ");	
		}
		System.out.println();
		
	}

}

}
