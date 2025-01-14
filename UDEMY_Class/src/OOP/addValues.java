package OOP;

public class addValues{
	
	public void Addition(int a, int b) {
		int c = a + b;
		System.out.println("Sum is: "+c);
	}
	
	
	public void Addition(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Sum is: "+d);
	}
	
	public double addValues(double e, double f) {
		double c  = e + f;
		return c;
	}
	
	public static void main(String[] args) {
		addValues add = new addValues();
		
		add.Addition(10, 5);

	}

}
