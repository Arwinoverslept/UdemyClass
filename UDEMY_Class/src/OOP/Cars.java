package OOP;

public class Cars {
	
	Cars(){
		System.out.println("Constructor: ");
	}
	
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
	}
	
	String name  = "Car Segment";

	public void run() {
		System.out.println("Cars is Running");	
		
	}

}
