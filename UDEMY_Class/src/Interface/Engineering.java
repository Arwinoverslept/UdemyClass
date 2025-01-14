package Interface;

public class Engineering implements Student{

	@Override
	public void displayName() {
		System.out.println("Name: Arwin Viernes");
		
	}

	@Override
	public void getStudNumber() {
		System.out.println("Student Number: 18-050456");		
	}

	@Override
	public void getStandard() {
		System.out.println("Status: Graduate");		
	}

}
