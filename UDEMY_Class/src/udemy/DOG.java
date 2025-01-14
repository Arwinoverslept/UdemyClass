
package udemy;

public class DOG {
	
		String name = "Jacky";
		String breed = "Bully";
		int height = 4;
		
		public void Barking () {
			System.out.println(name + " is barking!");
		}
		
		public void eating() {
			System.out.println(name +" is eating");
		}
		
		public static void main(String[] args) {
			DOG dogclass = new DOG();
			DOG obj2 = new DOG();
			
			System.out.println(dogclass.height);
			
			dogclass.Barking();
			dogclass.eating();

		}
	}
