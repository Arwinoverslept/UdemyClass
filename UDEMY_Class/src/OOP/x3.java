package OOP;

public class x3 extends BMW{
	
	static String model = "F1";
	
	public static void main(String[] args) {
		BMW modelBmw = new BMW();
		
//		System.out.println("Model name: " +name);
//		System.out.println("Brand is: " +BMW.name);
		System.out.println("Behavior is");
		modelBmw.run();
	}
}
