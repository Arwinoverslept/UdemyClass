package Interface;

public class Meds implements Student{

	@Override
	public void displayName() {
		System.out.println("Name: Tiara Mechaella Degorio");
		
	}

	@Override
	public void getStudNumber() {
		System.out.println("Student Number: 18-050xxx");	
		
	}

	@Override
	public void getStandard() {
		System.out.println("Status: Graduate");
		
	}
	
	public void getUni() {
		System.out.println("University: "+Student.University);
	}
	
	@Override
	public void getInterfaceName() {
		System.out.println("");
		
	}
	
	
	public static void main(String[] args) {
		Engineering eng = new Engineering();
		Meds med = new Meds();
		
		eng.displayName();
		eng.getStudNumber();
		eng.getStandard();
		eng.getUni();
		
		System.out.println("");
		
		med.displayName();
		med.getStudNumber();
		med.getStandard();
		med.getUni();
	}

	

}
