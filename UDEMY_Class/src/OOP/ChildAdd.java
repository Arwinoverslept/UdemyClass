package OOP;

public class ChildAdd extends addValues{

	public static void main(String[] args) {
			addValues add = new addValues();
			
			add.Addition(54, 100);
			add.Addition(12, 11, 14);
			
			double d = add.addValues(11.11,22.22);
			System.out.println(d);
	}

}
