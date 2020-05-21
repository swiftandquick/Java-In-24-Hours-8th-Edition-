package com.java24hours.hour11.p2;

public class Gremlin {

	private String creator;
	private int maximumAge; 
	
	// Constructor for "blender".  
	public Gremlin() {
		creator = "Michael Finnell"; // creator is a string
		maximumAge = 240; // maximumAge is an int
	}
	
	// Constructor for "plate".  
	public Gremlin(String name, int size) {
		creator = name;
		maximumAge = size;
	}

	/**
	 * Main method can be in the same class or separate class, in this case, it's in
	 * the same class. Even though instance variables are private, I can still
	 * access to those variables because private instance variables work in the same
	 * class.  If main method is in another class, I will need getters.  
	 */
	public static void main(String args[]) {
	
		// Assigns attributes to the object.  
		Gremlin blender = new Gremlin();
		Gremlin plate = new Gremlin("Zach Galligan", 960);
		
		// "blender" has inherited variables from constructor, so no need to give new values.  
		System.out.println(blender.creator);
		System.out.println(blender.maximumAge);
		
		// The constructor doesn't have defined variable, so I have to assign "plate" variables.  
		System.out.println(plate.creator);
		System.out.println(plate.maximumAge);
		
	}

	
}
