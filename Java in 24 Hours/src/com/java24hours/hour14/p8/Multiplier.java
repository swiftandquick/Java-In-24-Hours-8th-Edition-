package com.java24hours.hour14.p8;

/* Run -> Run Configurations -> Arguments.  
 * Write "2 4 3 5x" in the argument field.  
 */

public class Multiplier {

	public static void main(String arguments[]) {
		
		float product = 1;
		
		// Run through every argument inside the arguments array.  
		for(String argument : arguments) {
			try {
				product = product * Float.parseFloat(argument);
			}
			/** The product value is still kept, however, it will not multiply 5x because it causes an exception.  */
			catch (NumberFormatException e) {
				System.out.println(argument + " is not a number.  ");
			}
		}
		
		System.out.println("The product is:  " + product);
		
	}

}
