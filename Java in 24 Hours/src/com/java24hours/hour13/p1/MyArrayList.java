package com.java24hours.hour13.p1;

import java.util.ArrayList;

/* An array always stores 90 elements.  
 * An array list can store as many objects as I want.  
 * When importing an ArrayList, class name can't be ArrayList.  
 */

public class MyArrayList {

	public static void main(String args[]) {
		
		// Create a string array list servants.  
		ArrayList<String> servants = new ArrayList<String>();
		
		// Add string objects into the array list.  
		servants.add("Bates"); // Index 0
		servants.add("Anna"); // Index 1
		servants.add("Thomas"); // Index 2
		servants.add("Mrs. O'Brien"); // Index 3
		servants.add("Daisy"); // Index 4
		
		// Remove string objects from the list.  
		servants.remove("Mrs. O'Brien"); // Removes string object called "Mrs. O'Brien".  
		
		// servants.size() should be the .  
		int servantCount = servants.size();
		System.out.println("# of servants:  " + servantCount);
		
		/* Use for loop to print out every element of the array list servants();
		 * The "servant" is the element of the array list.  
		 */
		for (String servant : servants) {
			System.out.println(servant);
		}
		
		int hasDaisy = servants.indexOf("Daisy");
		System.out.println("Which index is Daisy in?  " + hasDaisy);
		
		boolean hasCarson = servants.contains("Carson");
		System.out.println("Carson works here, true or false:  " + hasCarson);
		
		
		// Create a string array list aristocrats.  
		ArrayList<String> aristocrats = new ArrayList<String>();
		
		// Add string objects into the array list.  
		aristocrats.add(0, "Lord Robert"); // Add to index 0.  Later became index 1.  
		aristocrats.add(1, "Lady Mary"); // Add to index 1.  Later became index 2.  
		aristocrats.add(2, "Lady Edith"); // Add to index 2.  Later became index 3.  
		aristocrats.add(3, "Lady Sybil"); // Add to index 3.  Later became index 4.  
		aristocrats.add(0, "Lady Grantham"); // Lady Grantham became the new index 0.  
		
		// Remove index 4 from the array list, which is currently "Lady Sybil".  
		aristocrats.remove(4); 
		
		// Print out the current aristocrats string, longer format.  
		for (int i = 0; i < aristocrats.size(); i++) {
			String aristocrat = aristocrats.get(i);
			System.out.println(aristocrat); 
		}
	}
	
}
