package OOP;

public class BMW extends Cars{
	
	BMW(){
		super();
		System.out.println("BMW Constructor");
	}
	
	String name = "Mercedes";
	
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void run() {
		System.out.println("BMW is Running");
		super.run();
	}
	
	public static void main(String[] args) {
//		Cars cars = new Cars();
//		
//		System.out.println(name);
//		cars.run();
		BMW bmw = new BMW();
		bmw.run();
		
		
		
	
		
	}
	
}
