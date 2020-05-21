package com.java24hours.hour10.p2;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Casting {

	public static void main(String args[]) {
		
		/* Casting produces a new value that is a different type of variable or object than its source.  
		 * source_type source_varaible = source_value; 
		 * destination_type destination_varaible = (destination_type) source_variable; 
		 */
		
		// Casts a float value into an int. 		
		float source = 7.00F;
		int destination = (int) source;  
		System.out.println(destination);
		
		/* The following casts a much larger type (int) to a smaller type (byte).  
		 * When int is assigned to the value between -128 to 127 inclusive.  
		 * The conversion to the byte of that number will remain the same.  
		 * In this case, xNum's value is 103, so val (byte) will remain the same.  
		 */
		int xNum = 103;
		byte val = (byte) xNum;
		System.out.println(val);
		
		/* I can also convert between variables and objects.  
		 * int is primitive type, it stores the binary value for the integer that I want to represent.  
		 * Integer is a (wrapper) class of int, as it has a single field of type int.  
		 */
		Integer suffix = 5309;  
		int newSuffix = suffix;  
		System.out.println(newSuffix);
		
		// Conversion from String to int.  
		String count = "25";
		int myCount = Integer.parseInt(count);
		System.out.println(myCount);
	}
	
	/* Casting objects is possible when the source and destination are related by inheritance.  		
	 * comp is the source, and comp2D is the destination.  
	 * comp2d inherits all variables and methods that the subclass defines.  
	 */
	public void paintComponent (Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp; 
	}
	
}
