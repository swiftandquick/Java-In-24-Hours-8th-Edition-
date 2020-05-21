package com.java24hours.hour6.p2;

public class StringHandling {

	public static void main(String[] arguments) {
		
		// Comparing two strings.  
		String favorite = "chainsaw";
		String guess = "pool cue";
		System.out.println("Is Fin's favorite weapon a " + guess + "?");
		// varA.contentEquals(varB) returns true or false base on whether varA's content is equal to varB.  
		System.out.println("Answer:  " + favorite.contentEquals(guess));
		
		// Find the length of the string.  
		String cinematographer = "Ben Demaree";
		int nameLength = cinematographer.length();
		System.out.println("Name length:  " + nameLength);
		
		// Set to upper case.  
		String fin = "Ian Ziering";
		String change = fin.toUpperCase();
		System.out.println("Name in upper case:  " + change);

		// Finding index, text is not in string, so it will print out -1.  
		String script = "Sharknado";
		int position = script.indexOf("We're gonna need a bigger chopper");
		System.out.println(position);
		
		// Now that the String contains the corresponding characters, position will not be -1.  
		String sentence = "I love to eat pie!";
		int newPosition = sentence.indexOf("eat");
		System.out.println(newPosition);
	}
	
}
