package com.java24hours.hour12.p1;

class Parent {
	void show()
	{
		System.out.println("Parent's show()");
	}
}
	
class Child extends Parent  {
	/* This method overrides the show() of Parent.  
	 * Which means only show() in the Child subclass will print.  
	 */
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}

class Overriding {

	public static void main(String args[]) {
		/* Creates an object associates with parent class.  
		 * The object calls the show() method.  
		 */
		Parent myObj1 = new Parent();
		myObj1.show();
		
		/* If a parent type reference refers to a child object Child's show() 
		 * is called.  This is called run time polymorphism.  
		 */
		Parent myObj2 = new Child();
		myObj2.show(); 
	}
	
}