package com.java24hours.hour3;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String args[]) {
		
		// Use scanner to get input.  
		Scanner input = new Scanner(System.in); 
		
		// String input.  
		System.out.println("Enter a string:  ");
		String stringInput = input.nextLine();
		System.out.println("Your input string is:  " + stringInput);
		
		// Get the sum of two input integers.  
		System.out.println("Enter the first number:  ");
		int numberInput1 = input.nextInt(); 
		System.out.println("Enter the second number:  ");
		int numberInput2 = input.nextInt();
		int result = numberInput1 + numberInput2;
		System.out.println("The sum of " + numberInput1 + " and " + numberInput2 + " is " + result + ".  "); 
		
		input.close();
		
	}
	
}
