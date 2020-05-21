package com.java24hours.hour16.p1;

public class Simple {

	class InnerSimple {
		InnerSimple() {
			System.out.println("I am an inner class!  ");
		}
	}
	
	public Simple() {
		// Empty constructor.  
	}
	
	public static void main(String[] arguments) {
		// Creates an object called program.  
		Simple program = new Simple();
		/* Creates an object as a reference to Simple.InnerSimple.  
		 * Format to refer to an inner class:  outer_class.inner_class.  
		 * Use the object "program" to call the inner class.  
		 */
		Simple.InnerSimple inner = program.new InnerSimple();
	}
	
}
