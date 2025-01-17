package Array;

public class PassArrayToMethod {

	public static void findMin(int arrayOne[]) {
		
		int min = arrayOne[0];
		int max = arrayOne[0];
		
		for (int i = 1; i< arrayOne.length; i++) {
			if (min>arrayOne[i]) {
				min = arrayOne[i];
			}
		}
		
		for (int j = 1; j< arrayOne.length; j++) {
			if (max<arrayOne[j]) {
				max = arrayOne[j];
			}
		}
		
		System.out.println("Minimum element is: "+min);
		System.out.println("Max element is: "+max);
	}
	
	public static int[] getArr() {
		 
		return new int[] {12,43,55,63,78};
	}
	
	
	
	public static void main(String[] args) {
		PassArrayToMethod pass = new PassArrayToMethod();
		
		
		int arrayTest[] = {12,11,10,9,8,7,6,5,4,3,2,1};
		
		pass.findMin(arrayTest);
		
		int arrayThree[] = pass.getArr();
		System.out.println(arrayThree[3]);
		
	}
	
}
