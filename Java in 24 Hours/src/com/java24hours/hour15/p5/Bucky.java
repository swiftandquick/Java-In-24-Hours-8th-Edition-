package com.java24hours.hour15.p5;

public class Bucky {

	public static void main(String[] args) {
		/* Four different objects, one in each thread.  
		 * Calls the Tuna() method from the Tuna class.  
		 * Passes in a string.  
		 */
		Thread t1 = new Thread(new Tuna("one"));
		Thread t2 = new Thread(new Tuna("two"));
		Thread t3 = new Thread(new Tuna("three"));
		Thread t4 = new Thread(new Tuna("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
