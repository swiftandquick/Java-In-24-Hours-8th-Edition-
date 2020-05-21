package com.java24hours.hour11.p4;

// This class cannot run, run the class with main method.  

public class Gremlin {

	static int gremlinCount = 0;
	
	Gremlin() {
		gremlinCount++;  
	} 
	
	/* Returns the gremlinCount value, which is equivalent 
	 * to the number of array indexes in the object array.  
	 */ 
	static int getGremlinCount() {
		return gremlinCount;
	}
	
}
