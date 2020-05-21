package com.java24hours.hour12.p2;

// Private methods are not overridden.  
class Parent {
	// Private class cannot be called.  
	private void m1() {
		System.out.println("From parent m1()"); 
	}
	/* Protected methods can be overridden.  
	 * It will not print when the Child method is called.  
	 */
	protected void m2() {
		System.out.println("From parent m2()"); 
	}
}

class Child extends Parent {
	private void m1() {
		System.out.println("From child m1()");
	}
	// Overrides protected void m2() in Parent class.  
	@Override
	public void m2() {
		System.out.println("From child m2()");
	}
}

public class Overriding2 {
	public static void main(String args[]) {
		/* Creates an object associated with Parent.  
		 * Calls the m2() method in the Parent class.  
		 */
		Parent myObj1 = new Parent();
		myObj1.m2(); 
		/* Creates an object associated with Child.  
		 * m2() from Child class overrides m2() from Parent class.  
		 * Thus, only the m2() method in the Child class is called.  
		 */
		Parent myObj2 = new Child();
		myObj2.m2(); 
	}
}
