package com.java24hours.hour14.p5;

/* Run -> Run Configurations -> Arguments.  
 * Try the following pairs in argument field:  
 * "5 2", "79 6", "2x 2", "50 2", "3 0"
 */

public class NumberDivider {

	public static void main(String[] arguments) {
		
		if (arguments.length == 2) {
			int result = 0;
			try {
				result = Integer.parseInt(arguments[0]) / Integer.parseInt(arguments[1]);
				System.out.println(arguments[0] + " divided by " + arguments[1] + " equals " + result);
			}
			// If the input is not an integer.  "2x 2" will trigger this error.  
			catch (NumberFormatException e) {
				System.out.println("Both arguments must be integers.  ");
			}
			// If the equation involves division by zero.  "3 0" will trigger this error.  
			catch (ArithmeticException e) {
				System.out.println("You cannot divide by zero.  ");  
			}
			/* Just "Exception" handles all exceptions.  
			catch (Exception e) {
				System.out.println("Something is wrong with the code, it could be anything.  ");
			}
			*/ 
		}
		
	}
	
}
