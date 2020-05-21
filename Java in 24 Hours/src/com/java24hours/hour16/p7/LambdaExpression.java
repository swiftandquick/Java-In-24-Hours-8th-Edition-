package com.java24hours.hour16.p7;

public class LambdaExpression {
	
	public static void main(String args[]) {
		/* Create an object called runner.  
		 * Then create an associated function 
		 * without belonging to any class.  
		 */
		Runnable runner = () -> System.out.println("Run!");
		
		// Create a new thread to run the program.  
		new Thread(runner).start();
	}
	
}
