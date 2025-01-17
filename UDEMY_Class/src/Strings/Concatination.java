package Strings;

public class Concatination {

		public static void main(String[] args) {
			String firstname = "Arwin";
			String lastname = "Viernes";
			String nickname = "Overslept";
			
			System.out.println(firstname + lastname);
			System.out.println(firstname+ " "+lastname);
			
			String fullname = firstname.concat(lastname).concat(nickname);
			System.out.println(fullname);
			
			System.out.println(lastname.concat(nickname).concat(firstname));
			
		}
}
