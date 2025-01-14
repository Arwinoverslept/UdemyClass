package udemy;


public class Students {
	
	public Students() {
		System.out.println("Constructor Method");
		System.out.println("2nd Constructor Method");
	}
	
	int rollNumber;
	String name;

	 public Students(int i, String n) {
		 rollNumber = i;
		 name = n;
		 
	 }
	
	 
	 public void Display() {
		 System.out.println("Roll Number is: "+rollNumber+" and Name is: "+name);
	 }
	 
	public static void main(String[] args) {
		Students std = new Students();
		Students std1 = new Students(10, "Arwin");
		Students std2 = new Students(20, "JM");
		
		std1.Display();
		std2.Display();
		

	}

}
