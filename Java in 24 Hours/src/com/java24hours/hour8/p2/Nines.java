package com.java24hours.hour8.p2;

public class Nines {

	public static void main(String[] arguments) {
		
		// Prints only first 200 multiples of 9, which is up to 1800.  
		for (int dex = 1; dex <= 200; dex++) {
			int multiple = 9 * dex;
			System.out.print(multiple + " ");
		}
		
		System.out.println();
	}
	
}
