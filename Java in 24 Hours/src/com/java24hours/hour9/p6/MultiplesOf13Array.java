package com.java24hours.hour9.p6;

public class MultiplesOf13Array {

	public static void main(String[] arguments) {
		// Creates an array that stores 400 integers.  
		int[] multiplesOf13 = new int[400];
		for (int i = 0; i < multiplesOf13.length; i++) {
			// Assign value to index.  
			multiplesOf13[i] = 13 * (i + 1);
			System.out.print(multiplesOf13[i] + "\t");
			// For every 20th multiple of 13, skip a line.  
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println("\nLet's test it out, check index #199 of the array!");
		System.out.println("\n" + multiplesOf13[199]);
		System.out.println("\nIt is correct!");
	}
	
}