package udemy;

public class Exercise  {
	
	String title, author;
	static int count = 0;
	
	public Exercise (String title, String author) {
		this.title = title;
		this.author = author;
		count++;
	}

	public void display() {
		System.out.println("Book Count: "+count+" "+"Book Title: "+title+" "+"Author: "+author);
	}

	public static void main(String[] args) {
		Exercise About = new Exercise("That time I got reincarnated as a Slime","Japanese");
		About.display();
		Exercise About1 = new Exercise("Toradora","Japanese");
		About1.display();
		Exercise About2 = new Exercise("Your Lie in April","Japanese");	
		About2.display();
		Exercise About3 = new Exercise("I want to eat your Pancreas","Japanese");	
		About3.display();
	}

}
