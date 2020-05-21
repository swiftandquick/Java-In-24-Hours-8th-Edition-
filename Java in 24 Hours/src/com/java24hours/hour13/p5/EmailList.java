package com.java24hours.hour13.p5;

import java.util.HashMap;
import java.util.Map;

public class EmailList {

	public static void main(String args[]) {
		
		/* Create a default hash map, by default 
		 * it has 16 objects and 0.75 load factor.  
		 */
		HashMap <String, String> emailList = new HashMap<>();
		
		emailList.put("Jamie", "jpham14@wit.edu");
		emailList.put("Eric", "eweng16@outlook.com");
		emailList.put("Steve", "stevew2020@gmail.com");
		emailList.put("Alex", "ayip2014@yahoo.com");
		emailList.put("Elvin", "elvinxuk@gmail.com");
		
		// Prints all objects in a line.  
		System.out.println(emailList);
		
		// Check the size of the hash map.  
		int howManyEmails = emailList.size();
		System.out.println("There are currently " + howManyEmails + " in the E-mail list.  ");
		
		// Check to see if the key "Jamie" is on the list.  
		boolean isJamieHere = emailList.containsKey("Jamie");
		System.out.println("Jamie's email is on the list:  " + isJamieHere);
		
		// Check to see if the value "ychomework@gmail.com" is on the list.  
		boolean amIHere = emailList.containsValue("ychomework@gmail.com");
		System.out.println("My email on the list:  " + amIHere);
		
		// Checks if the key "Yong" is on the list, if it isn't, add the default email.  
		String myEmail = emailList.getOrDefault("Yong", "ychomework@gmail.com");
		System.out.println(myEmail);
		
		// Hash maps sorts via alphabetical order.  
		for (Map.Entry<String, String> entry : emailList.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Name:  " + key + "\nEmail:  " + value);
		}
		
	}
	
}
