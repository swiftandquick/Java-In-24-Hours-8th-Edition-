package com.java24hours.hour9.p2;

public class SpaceRemover {

	public static void main(String[] arguments) {
	
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		// Transform a string into an array of characters.  
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			// If current character is space, replace it with period.  
			if (current != ' ' ) {
				System.out.print(current);
			} else {
				System.out.print('.');
			}
		}
		System.out.println();
	}
	
}
