package com.java24hours.hour4.p4;

public class NewRoot {

	public static void main(String[] arguments) {

		// Alternate way to find the square root.  
		int x = 625;
		int root;
		
		/** sqrt method returns double, so I have to cast it as an int.  */
		root = (int) Math.sqrt(x);
		
		// Prints out the root of 625.  
		System.out.println(root);
	}
	
}
