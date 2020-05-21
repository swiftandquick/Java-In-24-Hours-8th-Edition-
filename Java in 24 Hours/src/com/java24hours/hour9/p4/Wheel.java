package com.java24hours.hour9.p4;

public class Wheel {

	// For more information, check page 120 and page 121.  
	
	public static void main(String[] arguments) {
		
		String phrase[] = {
				"A STITCH IN TIME SAVES NINE",
				"DON'T EAT YELLOW SNOW",
				"TASTE THE RAINBOW",
				"EVERY GOOD BOY DOES FINE",
				"I WANT MY MTV",
				"I LIKE IKE",
				"PLAY IT AGAIN, SAM",
				"FROSTY THE SNOWMAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"SHEFFIELD WEDNESDAY",
				"GROVER CLEVERLAND OHIO",
				"SPAGHETTI WESTERN",
				"TEEN TITANS GO",
				"IT'S A WONDERFUL LIFE"
		};
		
		
		/* letterCount is an integer array with 26 indexes.  
		 * Each index represents the number of times a letter appear.  
		 */
		int[] letterCount = new int[26];
		
		// The for loop goes through every string element in the phrase array.  
		for (int count = 0; count < phrase.length; count++) {
			// Turn the each string of the "phrase" array into a "letters" array of character.  
			String current = phrase[count]; 
			char[] letters = current.toCharArray();
			// This for loop goes through every character of the "letters" array.  
			for (int count2 = 0; count2 < letters.length; count2++) {
				// individualLetter is the current value of the character (letter).  
				char individualLetter = letters[count2];
				// The conditional statement below weeds out non-capital-alphabets.  
				if ( (individualLetter >= 'A') & (individualLetter <= 'Z') ) {
					/* For each time the letter within alphabetical range appears, 
					 * add one to the letterCount.  
					 */
					letterCount[individualLetter - 'A']++;
				}
			}
		}
		
		// Print out the results from A to Z.  
		for (char currentLetter = 'A'; currentLetter <= 'Z'; currentLetter++) {
			/* currentLetter - 'A' gives us back an integer.  
			 * Each char is represented by a number.  
			 */
			System.out.print(currentLetter + ":  " + letterCount[currentLetter - 'A'] + "\t");
			if (currentLetter == 'M') {
				// Skip a line when we get to M.  
				System.out.println();
			}
		}
		System.out.println();
		
	}
	
}
