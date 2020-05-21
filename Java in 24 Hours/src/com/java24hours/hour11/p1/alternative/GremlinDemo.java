package com.java24hours.hour11.p1.alternative;

/**
 * In the previous version of Gremlin class, I use public instance variables,
 * which is not good, here, I fix them with private variables.
 */

public class GremlinDemo {
	
	public static void main(String args[]) {
		
		/**
		 * Passes argument to constructor, now the creator Gizmo created 1 gremlin, the
		 * maximum age is 39.
		 */
		Gremlin gizmo = new Gremlin("Gizmo", 39);

		// Adds another gremlin, maximum age is still 39 because 29 < 39.  
		gizmo.createGremlin(29);
		
		// Adds a third gremlin, maximum age is now 49 because 49 > 39.  
		gizmo.createGremlin(49);

		// Adds a fourth gremlin, maximum age is now 50 because 50 > 49.  
		gizmo.createGremlin(50);

		// Triggers the void method to print out the result.  
		gizmo.writeOutput();
		
	}
	
}
