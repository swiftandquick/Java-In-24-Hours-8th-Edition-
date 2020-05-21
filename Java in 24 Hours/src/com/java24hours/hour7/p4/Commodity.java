package com.java24hours.hour7.p4;

public class Commodity {

	public static void main(String[] arguments) {
		String command = "BUY";
		int balance = 550;
		int quantity =  42;
		
		switch (command) {
			case "BUY":
				quantity += 5;
				balance -= 20;
				break;
			case "SELL":
				quantity -= 5;
				balance += 15;
				break;
			default:
				System.out.println("Invalid input.");
				break;
		}
		
		System.out.println("Balance:  $" + balance + "\n" + "Quantity:  " + quantity);
		
	}
	
}
