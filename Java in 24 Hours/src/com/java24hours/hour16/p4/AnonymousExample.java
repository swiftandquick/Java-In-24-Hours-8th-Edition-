package com.java24hours.hour16.p4;

class A {
	public void show() {
		System.out.println("In A show.  ");
	}
}

public class AnonymousExample {

	public static void main(String[] args) {
		/**
		 * The show() method inside the block after object declaration overrides the
		 * show() method outside of the Anonymous Example. The method contained inside 
		 * the block show() is called anonymous method.  Anonymous method with the 
		 * same signature (from my knowledge) overrides methods outside of it.  
		 */
		A obj = new A() {
			@Override
			public void show() {
				System.out.println("I'm the best!  ");
			}
		};
		
		// obj.show() calls the method inside the AnonymousExample class.  
		obj.show();
	}
	
}