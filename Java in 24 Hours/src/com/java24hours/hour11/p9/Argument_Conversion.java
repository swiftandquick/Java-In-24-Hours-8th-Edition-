package com.java24hours.hour11.p9;

/* 1.  Go to Run, then Run Configuration.  
 * 2.  Enter com.java24hours.hour10.p3.NewRoot as the Main Class.  
 * 3.  Click on the Arguments tab, then enter 500 in the Program Arguments field.  
 * 4.  Click OK to close the dialog.  
 */

public class Argument_Conversion {

	public static void main(String args[]) {

		// The argument is always a string.  
		String string_value = args[0];
		System.out.println("String:  " + string_value);
		
		// Convert string to float.  
		float float_value = Float.parseFloat(string_value);
		System.out.println("Float:  " + float_value);
		
		// Autoboxing:  Convert float (primitive type) to Float (wrapper class).  
		Float float_object = float_value;
		System.out.println("Float Object:  " + float_object); 
		
		/* I couldn't find a way to convert from Float to int.  
		 * Here, I convert Float to float, then convert to int.  
		 */
		float float_value2 = (float) float_object;
		int integer_value = (int) float_value2;
		System.out.println("Integer:  " + integer_value);
		
	}
	
}
