package com.java24hours.hour12.p5;

// Imports array list function.  
import java.util.ArrayList;

public class Array {

	public static void main(String args[]) {
		ArrayList<String> structure = new ArrayList<String>(300); // New way to declare array list.  
		/* ArrayList structure = new ArrayList(); 
		 * The above line is the old way of declaring an array list.  
		 * However, the new way is far more reliable because if I put a variable 
		 * of different type in the array list, it can check for error.  
		 */
		
		// Adding elements into the array list.  
		structure.add("Vance"); // Index 0.  
		structure.add("Vernon"); // Index 1.  
		structure.add("Velma"); // Index 2.  
		
		// Get the first index of structure array list, which is Vernon.  
		String name = structure.get(1);
		System.out.println(name);
		
		// Check to see if the structure array list contains "Velma".  
		if(structure.contains("Velma")) {
			System.out.println("Velma found!  ");
		}
		
		// Remove array elements.  
		structure.remove(0); // Remove index 0, which is "Vance".  
		structure.remove("Vernon"); // Remove the array element "Vernon".  
		// The only element left is "Velma".  
	}
	
}
