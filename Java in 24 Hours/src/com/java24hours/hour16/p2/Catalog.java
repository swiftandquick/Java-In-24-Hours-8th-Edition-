package com.java24hours.hour16.p2;

// These codes are from hour 14, but this time I implement it with inner class.  

import java.net.*;

public class Catalog {

	class HomePage {
		String owner; 
		URL address; 
		String category = "none";
	
		/*
		 * Constructor with 2 variables in parameter. Throws an exception since
		 * inAddress did not convert to string. Object from index 4 passes arguments to
		 * this method, as it only has two arguments.
		 */
		HomePage(String inOwner, String inAddress) 
				throws MalformedURLException {
				owner = inOwner;
				// Convert string to URL.  
				address = new URL(inAddress);
		}

		/*
		 * Constructor with 3 variables in parameter. Throws an exception since
		 * inAddress did not convert to string. Object from index 1 to index 3 passes
		 * arguments to this method, as it has three arguments.
		 */
		HomePage(String inOwner, String inAddress, String inCategory) 
				throws MalformedURLException {
				this(inOwner, inAddress);
				category = inCategory; 
		}
		
	}
	
	/** Default constructor.  */
	Catalog() {
		/* Creates an array of objects called catalog, it contains 5 objects.  
		 * Catalog.HomePage sets the instance as the HomePage inner class.  
		 */
		Catalog.HomePage[] catalog = new Catalog.HomePage[5];
		try {
			/* All these objects from the array refer to one of the two 
			 * HomePage methods from the inside of inner class HomePage.  
			 */
			catalog[0] = new HomePage("Mike Glycer", 
					"http://www.file770.com", "science fiction"); 
			catalog[1] = new HomePage("Shelley Powers", 
					"http://burningbird.net", "environment"); 
			catalog[2] = new HomePage("Rogers Cadenhead", 
					"http://workbench.cadenhead.org", "programming"); 
			catalog[3] = new HomePage("Taegan Goddard", 
					"http://politicalwire.com", "politics"); 
			catalog[4] = new HomePage("Manton Reese", 
					"http://manton.org");
			for (int i = 0; i < catalog.length; i++) {
				System.out.println(catalog[i].owner + ":  " + 
				catalog[i].address + " -- "
						+ catalog[i].category);
			}
		}
		catch (MalformedURLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Reads main method first.  
	public static void main(String[] arguments) {
		/**
		 * Main method calls constructor Catalog(), I can only constructor like that,
		 * the other only type of method I can invoke from main method without object is
		 * static method. 
		 */
		new Catalog();
	}
	
}
