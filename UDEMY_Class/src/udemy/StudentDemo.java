package udemy;

public class StudentDemo {
	int rollnumber;
	String name;
	String Standard;
	
	public StudentDemo(int rollnumber, String name, String Standard) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.Standard = Standard;
	}
	
	public void display() {
		System.out.println("Rollnumber: "+rollnumber);
		System.out.println("Name: "+name);
		System.out.println("Class: "+Standard);
	}
	
	public static void main(String[] args) {
		StudentDemo Student1 = new StudentDemo(1, "Arwin", "Class A");
		StudentDemo Student2 = new StudentDemo(2, "CK", "Class A");
		
		Student1.display();
		Student2.display();
		
	}
}
