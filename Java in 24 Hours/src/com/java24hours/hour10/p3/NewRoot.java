package com.java24hours.hour10.p3;

public class NewRoot {

	/* 1.  Go to Run, then Run Configuration.  
	 * 2.  Enter com.java24hours.hour10.p3.NewRoot as the Main Class.  
	 * 3.  Click on the Arguments tab, then enter 9025 in the Program Arguments field.  
	 * 4.  Click OK to close the dialog.  
	 */
	
	/* argument[0] is a string, so it's necessary to convert it to integer via casting.  
	 * I entered "9025" in the Program Arguments field, which is stored as a string argument.  
	 */
	public static void main(String[] arguments) {
		int number = 100;
		if (arguments.length > 0) {
			if (arguments.length > 0) {
				number = Integer.parseInt(arguments[0]);
			}
			System.out.println("The square root of " + number
								+ " is " + Math.sqrt(number));
		}
	}
	
}