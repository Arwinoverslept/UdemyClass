package Encapsulation;

public class BPI extends Loans{

	public static void main(String[] args) {
		 Loans bankLoans = new Loans();
		 
		 bankLoans.setAge(19);
		 bankLoans.setName("Arwin");
		 bankLoans.setAmount(1000);
		 
		 System.out.println("Name: "+bankLoans.getName());
		 System.out.println("Age: "+bankLoans.getAge());
		 System.out.println("Amount: "+bankLoans.getAmount());
	}

}
