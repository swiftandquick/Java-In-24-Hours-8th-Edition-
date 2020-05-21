package com.java24hours.hour11.p1;

public class Gremlin_Output extends Gremlin {

	public static void main(String args[]) {
		
		// Creates a new object gizmo as an instance to the Gremlin class.  
		Gremlin gizmo = new Gremlin();
		
		// Change the creator variable as Joe Dante.  
		gizmo.creator = "Joe Dante"; 
		
		// Increment the object's attribute by 1. For static instance variables, I can
		// simply use class of the object Gremlin rather than the object name gizmo.
		Gremlin.gremlinCount++;
		
		System.out.println("Creator:  " + gizmo.creator);
		System.out.println("Life Span:  " + gizmo.maximumAge);
		System.out.println("# of Gremlins:  " + Gremlin.gremlinCount);
		
	}
	
}
