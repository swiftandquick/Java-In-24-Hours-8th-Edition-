package com.java24hours.hour11.p1;

/* Create an object as a class, inside the class, store variables.  
 * Superclasses are usually public for the purpose of inheritance.  
 */

public class Gremlin {

	/* Public variables can be used anywhere.  
	 * Protected variables can only be used inside the same class, within the same package, by subclasses.  
	 * Private variables can only be used inside the same class.  
	 */
	
	public int guid;
	// protected int guid;  
	
	/** It should be set private by default.  */
	// private int guid;
	
	public String creator = "Chris Columbus";
	int maximumAge = 240; 
	
	static int gremlinCount = 0;
	
}
