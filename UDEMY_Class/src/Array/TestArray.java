package Array;

public class TestArray {
	
	public static void main(String[] args) {
		int arrayOne[] = new int [10];
		arrayOne[0] = 12;
		arrayOne[1] = 11;
		arrayOne[2] = 10;
		arrayOne[3] = 9;
		arrayOne[4] = 8;
		arrayOne[5] = 7;
		arrayOne[6] = 6;
		arrayOne[7] = 5;		
		
		for(int i = 0; i<arrayOne.length; i++) {
			System.out.println(arrayOne[i]);
		}
		
		System.out.println("");
		
		
		int arrayTwo[] = {12,13,11,15,16,7,9,90,9};
		for(int j = 0; j<arrayTwo.length; j++) {
			System.out.print(","+arrayTwo[j]);
		}
	}

}
