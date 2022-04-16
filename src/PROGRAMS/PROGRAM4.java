package PROGRAMS;

public class PROGRAM4 {
	
	public static void main(String[] args) {
		int[] DATA = {1,4,9,2,8,10};
		int K=1;
		int LOC=1;
		int max = DATA[1];
		for(K=0; K<DATA.length; K++) {
			if(K>DATA[K]) {
				LOC+=1;
				max = K;
			}
			if(max<DATA[K]) {
				LOC=K;
				max=DATA[K];
			}
		}
		System.out.println("Maximum number in the array is: " + max);
		System.out.println("Location of the maximum number is: " + LOC);
	}

}
