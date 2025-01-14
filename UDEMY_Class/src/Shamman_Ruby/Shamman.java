package Shamman_Ruby;

public class Shamman {
	
	int manna = 100;
	
	
	public void Attack() {
		manna  = manna - 2;
		System.out.println(manna);
	}
	
	public void TP(){
		manna  = manna - 3;
		System.out.println(manna);
	}
	
	public void Heal () {
		manna  = manna + 10;
		System.out.println(manna);
	}
		
	
	public static void main(String[] args) {
			Shamman shamman1 = new Shamman();
			
			shamman1.Attack();
			shamman1.Attack();
			shamman1.Attack();
			shamman1.Heal();
			shamman1.Heal();
			shamman1.TP();

	}
}


