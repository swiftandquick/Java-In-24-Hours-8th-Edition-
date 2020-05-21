package com.java24hours.hour8.p6;

public class MultipleOf13 {

	public static void main(String[] arguments) {
		
		// Prints the first 400 numbers that are multiples of 13.  
		int multiple_of_13;
		for (int index = 1; index <= 400; index++) {
			multiple_of_13 = index * 13;
			System.out.print(multiple_of_13 + " ");
		}
		
	}
	
}
