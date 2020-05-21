package com.java24hours.hour11.p5;

public class Getter_and_Setter {
	
	public static void main(String args[]) {
		/* An object is the instance of a class.  
		 * Creates object myObj as an instance of the class Person.  
		 */
		Person myObj = new Person();
		
		// Passes a string to the setName method.  
		myObj.setName("John"); // Set the value to John.  

		// Calls the method return name.  
		System.out.println(myObj.getName());
	}
	
}
