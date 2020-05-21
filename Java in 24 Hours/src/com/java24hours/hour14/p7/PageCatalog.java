package com.java24hours.hour14.p7;

import java.net.*;

public class PageCatalog {

	public static void main(String[] arguments) {
		// Creates an array of Objects called catalog.  
		HomePage[] catalog = new HomePage[5];
		try {
			/**
			 * Each catalog passes value to HomePage class of HomePage file. The second
			 * address is URL, so we have create a catch block that checks if the exception
			 * is there, if it is, we can continue to run the program after the exception 
			 * is caught.  Possible URL related exception is MalformedURLException.  
			 */
			catalog[0] = new HomePage("Mike Glyer", 
					"http://www.file770.com", "science fiction");
			catalog[1] = new HomePage("Shelley Powers", 
					"http://burningbird.net", "environment");
			catalog[2] = new HomePage("Rogers Cadenhead", 
					"http://workbench.cadenhead.org", "programming");
			catalog[3] = new HomePage("Taegan Goddard", 
					"http://politicalwire.com", "politics");
			catalog[4] = new HomePage("Manton Reese", 
					"http://www.manton.org");
			for (int i = 0; i < catalog.length; i++) {
				System.out.println(catalog[i].owner + ":  " + 
						catalog[i].address + " -- " + 
						catalog[i].category);
			}
		}
		catch (MalformedURLException e) {
			System.out.println("Error:  " + e.getMessage()); 
		}
	}
	
}
