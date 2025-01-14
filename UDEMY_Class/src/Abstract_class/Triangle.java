package Abstract_class;

public class Triangle extends Shape{

	@Override
	public void displayShape() {
		System.out.println("Shape is Triangle");
		
	}
	
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayShape();
		s1.displayShape();
	}

}
