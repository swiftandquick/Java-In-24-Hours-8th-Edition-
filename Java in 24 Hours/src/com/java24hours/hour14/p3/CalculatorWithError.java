package com.java24hours.hour14.p3;

/* Run -> Run Configurations -> Arguments.  
 * Enter 1 3 5x in Arguments Field.  
 * Note that 5x is not a number, and cannot be converted to integer.  
 */

public class CalculatorWithError {
	
	/**
	 * Alternatively, I can change the String[] array in argument field into a
	 * float[] array, so no need conversion.  Main method will work regardless 
	 * of what type of argument it accepts.  
	 */
	public static void main(float[] arguments) {
		float sum = 0;
		// Goes through every argument in the arguments array.  
		for (float argument : arguments) {
			/* Try to compile and see if the following line has any error.  
			 * Due to the try-catch block, the program still runs after catching an error.  
			 */
			try {
				// Argument is string, so must be converted to float.  
				sum = sum + argument;
			}
			// Throws an exception which says that it number format is wrong.  
			catch (NumberFormatException e) {
				System.out.println(argument + " is not a number.  ");
			}
		}
		System.out.println("Those numbers add up to " + sum);
	}

}