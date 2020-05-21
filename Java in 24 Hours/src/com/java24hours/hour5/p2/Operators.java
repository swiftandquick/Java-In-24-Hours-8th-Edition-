package com.java24hours.hour5.p2;

public class Operators {
	
	public static void main(String arguments[]) {
		
		// Let's manipulate the value of the variable weight.  
		double weight = 205;
		weight = weight + 10;
		weight = weight - 15;
		weight = weight * 3;
		weight = weight / 3;
		System.out.println("Weight:  " + weight);
		
		// Getting the remainder through modulo.  
		int remainder = 245 % 3;
		System.out.println("Remainder of 245 / 3 is " + remainder + ". ");
		
		// Long expression.  
		int score = 20;
		int total = 500 + (score * 12);
		System.out.println("Total Score:  " + total);
		
		// Increment and decrement.  
		int power = 10; // Will be increment by 2 later.  
		float rating = 10; // Will be decrement by 2 later.  
		power++;
		++power;
		rating--;
		--rating;
		System.out.println("Power:  " + power);
		System.out.println("Rating:  " + rating);
		
		// Multiple expressions.  
		int x = 3;
		int answer = ++x * 10; // This prints 40, x increments before multiply.  
		System.out.println("Answer:  " + answer);
		System.out.println("Current x value:  " + x);
		int z = 3;
		int answer2 = z++ * 10; // This prints 30, z increments after multiply.  
		System.out.println("Answer:  " + answer2);
		System.out.println("Current z value:  " + z);
		int y = 10;
		x = y * 3 + 5; // Overwrite the x value.  
		System.out.println("Overwritten x value:  " + x);
	}
}
