package com.java24hours.hour16.p3;

interface Age {
	/**
	 * Instance variables are private and are typically not placed in an interface.
	 * In this case, I want to inherit the x variable, so I permit it.
	 * Realistically, this should never happened.  
	 */
	int x = 21;
	void getAge();
}

class AnonymousDemo {
	public static void main(String[] args) {
		// MyClass is implementation class of Age interface.  
		MyClass obj = new MyClass();
		// Calling getAge() method implemented at myClass.  
		obj.getAge();
	}
}

// MyClass inherits all attributes and behaviors from Age interface.  
class MyClass implements Age {
	// Overrides the interface's getAge() method.  
	@Override
	public void getAge() {
		// Since MyClass inherits from Age interface, x is 21.  
		System.out.println("Age is " + x + ".  ");
	}
}