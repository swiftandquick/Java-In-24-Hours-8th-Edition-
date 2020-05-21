package com.java24hours.hour12.p3;

class Parent {
	// Static method will be hidden in subclass.  
	static void m1() {
		System.out.println("From parent " + "static m1()");
	}
	void m2() {
		System.out.println("From parent " + "non-static(instance) m2()");
	}
}

class Child extends Parent {
	// This method hides m1() in parent.  
	static void m1() {
		System.out.println("From parent " + "non-static(instance) m2()");
	}
	// Non-static public methods will override the parent class.  
	@Override
	public void m2() {
		System.out.println("From child " + "non-static(instance) m2()");
	}
}

public class Overriding3 {

	public static void main(String args[]) {
		// Format:  superclass_name object_name = new subclass_name()
		Parent myObj = new Child();
		myObj.m1(); // Since it's static, it can be declared Parent.m1();
		myObj.m2();
	}
	
}