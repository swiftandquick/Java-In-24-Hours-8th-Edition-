package com.java24hours.hour12.p6;

import java.util.ArrayList;
import java.util.Collections;

/* 1.  Go to Run, then Run Configuration.  
 * 2.  Enter com.java24hours.hour10.p3.NewRoot as the Main Class.  
 * 3.  Click on the Arguments tab, then enter Scotty Sonny Jason Dillon in the Program Arguments field.  
 * 4.  Click OK to close the dialog.  
 */

public class StringLister {

	// Creates a list of strings.  
	String[] names = { "Carly", "Sam", "Kiki", "Lulu", 
			"Hayden", "Elizabeth", "Kristina", "Molly", "Laura" };
	
	public StringLister(String[] moreNames) {
		
		// Creates a new array list.  
		ArrayList<String> list = new ArrayList<String>();
		
		// Adds every "names" array element to the new "list" array list.  
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		
		// Adds every "moreNames" array element to the new "list" array list.  
		for (int i = 0; i < moreNames.length; i++) {
			list.add(moreNames[i]);
		}
		
		// Automatically sorts the array list in alphabetical order.  
		Collections.sort(list);
		
		// Loops through the structure list, displaying each name to the screen.  
		for (String name : list) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] arguments) {
		/* Creates an object called lister, which associates with the class StringLister.  
		 * Calls the StringLister method.  Passes 4 additional arguments into the array.  
		 */
		StringLister lister = new StringLister(arguments);
	}
	
}
