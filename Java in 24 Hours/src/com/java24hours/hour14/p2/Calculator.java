package com.java24hours.hour14.p2;

/* Run -> Run Configurations -> Arguments.  
 * Enter 1 3 5x in Arguments Field.  
 */

public class Calculator {
	
	public static void main(String[] arguments) {
		float sum = 0;
		// Goes through every argument in the arguments array.  
		for (String argument : arguments) {
			// Argument is string, so must be converted to float.  
			/**
			 * With the try-catch block, the loop ends when inside the loop, the program
			 * tries to convert 5x into float.  
			 */
			try {
				sum = sum + Float.parseFloat(argument);
			}
			catch (NumberFormatException e) {
				System.out.println(argument + " is not a number.  ");
			}
		}
		System.out.println("Those numbers add up to " + sum);
	}

}
