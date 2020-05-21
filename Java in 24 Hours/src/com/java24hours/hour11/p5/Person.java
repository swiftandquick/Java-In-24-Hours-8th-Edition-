package com.java24hours.hour11.p5;

public class Person {
	
	/* As previously mentioned, private variables are only accessible within the same class.  
	 * Getter and setter methods can be used to retrieve them.  
	 */ 
	private String name; 
	
	// Getter
	public String getName() {
		// Returns the current value, which is "John".  
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		this.name = newName; 
		/* "this" refers to current object.  
		 * It differentiates instance variable from local variable.  
		 * Instance variables are variables that are pass from another method.  
		 */
	}
	
}
