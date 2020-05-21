package com.java24hours.hour11.p8;

public class Gremlin_Output {

	public static void main(String args[]) {
		
		Gremlin gob = new Gremlin();
		
		// Set guid to 5,000,000 by passing the value to setter method.  
		gob.setGuid(5000000);
		
		/* Get guid via getter method.  
		 * Only calls for getter method if guid is between 1,000,000 and 9,999,999.  
		 */
		if (gob.getGuid() >= 1000000 && gob.getGuid() <= 9999999) {
			System.out.println("The guid is " + gob.getGuid() + ". ");
		}
		else {
			System.out.println("Out of range.  ");
		}
		
	}
	
}
