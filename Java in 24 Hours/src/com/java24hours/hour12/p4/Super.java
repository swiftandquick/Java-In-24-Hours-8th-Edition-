package com.java24hours.hour12.p4;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	@Override
	void show() {
		// Calls the Parent class' (superclass) show() method.  
		super.show();
		System.out.println("Child's show()");
	}
}

public class Super {
	
	public static void main(String args[]) {
		Parent myObj = new Child();
		// Calls the show() method.  
		myObj.show();
	}
	
}
