package com.java24hours.hour14.p4;

public class MultipleErrors {

	public static void main(String args[]) {

		String textValue = "35";
		int value;
		
		/** I can handle individual exceptions separately.  */
		try {
			value = Integer.parseInt(textValue);
			System.out.println(value);
			/** Fortunately, this program has no error yet.  */
			System.out.println("There is no error.  ");
		}
		catch (NumberFormatException exc) {
			System.out.println("Incorrect number format!  ");
		}
		/** Division by 0 can cause the error below, but it doesn't happen in this program.  */
		catch (ArithmeticException exc) {
			System.out.println("Invalid arithmetic operation.  ");
		}
		
		/** Now, we change the String value to 35x, which can't be converted to value.  */
		textValue = "35x";
		
		/** I can also use one catch block to handle two different individual exceptions.  */
		try {
			value = Integer.parseInt(textValue);
			/** The lines below will not run because there is an error.  */
			System.out.println(value);
			System.out.println("There is no error.  ");
		}
		catch (NumberFormatException | ArithmeticException exc) {
			System.out.println("There is an error.  ");
		}
		
	}
	
}
