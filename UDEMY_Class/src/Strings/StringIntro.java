package Strings;

public class StringIntro {
	
		public static void main(String[] args) {
			String name = "JM";
			String name1 = "JM";
			
			String country = new String("USA");
			String country1 = new String("USa");
			
			
			//use for STRINGS
			System.out.println(name.equals(name1)); //True
			System.out.println(name.equalsIgnoreCase(name1)); //true
			System.out.println(country.equals(country1)); //False
			System.out.println(country.equalsIgnoreCase(country1)); //True
			
			System.out.println(name==name1); //True
			System.out.println(country==country1); //False
			
		}
		
}
