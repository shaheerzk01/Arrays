package PRACTICE;

public class EX4_6 {
	
	public static void main(String[] args) {
		//initialize 2-d array
		int[][] myarray = { { 1,2,3}, {4,5}};
		System.out.println("length of array:" + myarray.length); //number of rows
		for(int i=0;i<myarray.length;i++) {
			//length of each row
			System.out.println("length of 1D array(" + (i+1) +"):" + myarray[i].length);
		}

	}

}
