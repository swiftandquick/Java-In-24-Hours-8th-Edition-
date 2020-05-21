package com.java24hours.hour14.p7;

import java.net.*;

public class HomePage {
	
	String owner;
	URL address;
	String category = "none";

	/* MalformedURLException occurs when the string cannot be converted properly into a valid URL object.  
	 * HomePage removes the need to deal with MalformedURLException.  
	 * Throw MalformedURLException at the end of each function declaration can fix the errors.  
	 */
	
	/* Functions with 2 parameters will pass their arguments here.  
	 * Index 4 will use pass arguments to this parameter.  
	 * This function takes owner and address arguments and passes them back.  
	 * Since there is no category argument, category's local value is "none".  
	 * Therefore, Manton Reese's website also has the category of "none".  
	 */
	public HomePage(String inOwner, String inAddress)
		throws MalformedURLException {
		owner = inOwner;
		address = new URL(inAddress);
	}
	
	/* Functions with 3 parameters will pass their arguments here.  
	 * Index 0 to 3 will use pass arguments to this parameter.  
	 * Variables owner, address, and category will be the same as the inOwner, inAddress, in Category.  
	 * In other this function takes in arguments, then passes the same exact arguments back.  
	 */
	public HomePage(String inOwner, String inAddress, String inCategory)
		throws MalformedURLException {
		this(inOwner, inAddress); 
		category = inCategory; 
	}

}
