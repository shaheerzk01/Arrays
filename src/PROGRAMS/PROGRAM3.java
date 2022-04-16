package PROGRAMS;

public class PROGRAM3 {
	
	public void add(String n, int t, int s) {
		String[][] name = {{"xyz", "rst", "sh", "sg", "tre"}, {"asd", "hd", "fs","df", "ed"}};
		int len = name.length;
		String[][] name2 = new String[len][len];
		System.arraycopy(name, 0, name2, 0, name.length);
		name2[t][s] = n;
		for(int i=0; i<name2.length;i++) {
			for(int j=0;j<name2[i].length;j++) {
				System.out.print(name2[i][j] + " ");
			}
			System.out.println("\n");
		}
		}
	
	public void insert(int n, int t, int s) {
		int[][] array = {{1,2,3,6,78},{43,56,45,76,10}};
		
		int Index_position = n;
		int Index_position2 = s;
		int new_value = t;
		
		for(int i=array.length-1; i > Index_position; i--){
			for(int j=array[i].length-1; j> Index_position2; j--) {
				array[i][j] = array[i-1][j-1];
			}
		       
		   }
		array[Index_position][Index_position2] = new_value;
		for(int i=0; i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public void copy() {
		int[][] Array = {{1,5,2,7,3},{9,0,2,6,4}};
		int[][] Array2 = new int[Array.length][Array.length];
		System.arraycopy(Array, 0, Array2, 0, Array.length);
		for(int i=0; i<Array2.length;i++) {
			for(int j=0;j<Array2[i].length;j++) {
				System.out.print(Array2[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}
	
	public void delete(int n, int s) {
		int[][] array1 = {{1,5,9,5,3},{7,3,0,1,2}};
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				if(array1[i][j]==array1[n][s]) {
					continue;
				}
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		PROGRAM3 obj = new PROGRAM3();
		System.out.println("----------ADD METHOD----------\n");
		obj.add("shaheer", 0,1);
		System.out.println("----------INSERT METHOD----------\n");
		obj.insert(0, 2, 3);
		System.out.println("----------COPY METHOD----------\n");
		obj.copy();
		System.out.println("----------DELETE METHOD----------\n");
		obj.delete(1, 0);
	}


}
