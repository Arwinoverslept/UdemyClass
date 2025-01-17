package Strings;

public class buffer {

	public static void main(String[] args) {
		String name = "Arwin";
		name.concat(" Viernes");
		
		System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Arwin");
		
		name1.append(" Viernes");
		System.out.println(name1);
		
		name1.reverse();
		System.out.println(name1);
		
		name1.replace(1,3, "Seraphim");
		System.out.println(name1);
		
		name1.delete(1,3);
		System.out.println(name1);
	}

}
