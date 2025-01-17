package Encapsulation;

import java.security.PublicKey;

public class Loans {

	private String name;
	private int age;
	private int amount;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 80 && age <=18) {
			this.age = age;
		}else {
			System.out.println("Age is invalid!");
		}
		
	}
	
	public void setAmount(int amount) {
		
		if (amount >= 1000 && amount <=1000000) {
			this.amount = amount;
		}else {
			System.out.println("Please enter valid account.");
		}
		
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
