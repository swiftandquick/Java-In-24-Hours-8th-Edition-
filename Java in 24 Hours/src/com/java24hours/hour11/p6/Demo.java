package com.java24hours.hour11.p6;

/* There are three types of constructors in Java.  
 * This is a no argument constructor.  
 */

public class Demo {
		
	public Demo()
	{
		System.out.println("This is no argument constructor.  ");
	}
	
	public static void main(String args[]) {
		/* "new" creates a new object, 
		 * irrespective of whether one already exists.  
		 * Calls the Demo class.  
		 */
		new Demo();
	}
	
}
