package Strings;

public class StringMethod {

	public static void main(String[] args) {
		String textString = "Work From Home";
		char ch = textString.charAt(11);
		
		String textString3 = "LF: Full Remote";
		String textString4 = "LF: full remote";
		
		System.out.println(textString.charAt(10));
		System.out.println(ch);
		
		String textString2 = textString.concat(" Please").concat(". As Soon as Possible please").concat(textString3);
		System.out.println(textString2);
		
		System.out.println(textString.contains("From"));
		System.out.println(textString.contains("FROM"));
		
		System.out.println(textString.endsWith("Home"));
		System.out.println(textString.endsWith("HomE"));

		System.out.println(textString.equals(textString3));
		System.out.println(textString3.equalsIgnoreCase(textString4));
		
		
	}

}
