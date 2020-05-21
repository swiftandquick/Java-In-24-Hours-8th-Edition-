package com.java24hours.hour8.p1;

public class ForLoops {

	public static void main(String[] arguments) {
		
		// Goes through 0 to 999, prints out multiples of 12.  
		for (int dex = 0; dex < 1000; dex++) {
			if (dex % 12 == 0) {
				System.out.println("#:  " + dex);
			}
		}
		
		// You don't not need braces if for loop only has a single statement.  
		for (int p = 0; p < 500; p++)
			System.out.println("I will not sell miracle curses.  ");
		
	}
	
}
