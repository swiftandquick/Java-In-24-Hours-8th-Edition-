package com.java24hours.hour6.p4;

public class Favorite {

	public static void main(String[] arguments) {
		// Comparing two strings.  
		String favorite = "chainsaw";
		String guess = "pool cue";
		System.out.println("Is Fin's favorite weapon a " + guess + "?");
		// varA.contentEquals(varB) returns true or false base on weather varA's content is equal to varB.  
		if (favorite.contentEquals(guess)) {
			System.out.println("Yes, Fin's favorite weapon is " + guess + ".");
		} 
		else {
			System.out.println("No, Fin's favorite weapon is not " + favorite + ".");
			favorite = guess;
			System.out.println("Fin's favorite weapon is actually " + favorite + ".");
		}
	}
	
}
