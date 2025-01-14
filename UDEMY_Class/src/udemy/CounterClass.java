package udemy;
		
public class CounterClass {
		int i = 5;
		static int j = 10;
		
	public CounterClass() {
		i++;
		j++;
		
		System.out.println("Value of i is: "+i);
		System.out.println("Value of i is: "+j);
	}
				
	public static void main(String[] args) {
			CounterClass counter = new CounterClass();
			CounterClass counter2 = new CounterClass();
			CounterClass counter3 = new CounterClass();
		}
}
