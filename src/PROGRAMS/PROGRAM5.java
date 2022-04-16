package PROGRAMS;

public class PROGRAM5 {
	
	public void ONE(int n) {
		int[] array = {1,3,5,3};
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				System.out.println(n + ": Location is " + i + "\n");
			}
		}
	}
	
	public void TWO(int n) {
		int[][] array = {{1,5,2},{2,7,1}};
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]==n) {
					System.out.println(n + ": is at " + j + " Location of inner array and " + i + " Location of outer array\n");
				}
			}
		}
	}
	
	public void THREE(int n) {
		int[][][] array = {{{1,3,5},{8,78,30},{12,45,34}},{{13,76,40},{15,73,90},{37,29,10}}};
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				for(int k=0; k<array[i][j].length; k++) {
					if(array[i][j][k]==n) {
						System.out.println(n + ": is at " + k + " Location of inner most array and at " + j +
								" Location of inner array and at " + i + " Location of outer array\n");
					}
				}
			}
		}
	}
	

	public static void main(String[] args) {
		PROGRAM5 obj = new PROGRAM5();
		System.out.println("----------1D ARRAY----------\n");
		obj.ONE(5);
		System.out.println("----------2D ARRAY----------\n");
		obj.TWO(1);
		System.out.println("----------3D ARRAY----------\n");
		obj.THREE(3);
		
		

	}


}
