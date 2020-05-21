package com.java24hours.hour14.p1;

public class Exception {

	public static void main(String args[]) {
		
		/* The following code has error as array out of bound exception, 
		 * since index only goes from 0 to 2, but not 3.  
		 */
		String[] greek = { "Alpha", "Beta", "Gamma" };
		
		/**
		 * A try-catch block allows the program to continue to run even after it
		 * encounters a run time error.
		 */
		try {
			System.out.println(greek[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound!  ");
		}
	}
	
}
