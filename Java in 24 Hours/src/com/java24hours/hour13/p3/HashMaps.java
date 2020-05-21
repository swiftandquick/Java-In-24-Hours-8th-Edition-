package com.java24hours.hour13.p3;

import java.util.HashMap;

public class HashMaps {

	public static void main(String args[]) {
		
		/* Create a phone book as hash map with no arguments.  
		 * By default, hash maps have 16 objects and load factor of 0.75.  
		 */
		HashMap phonebook = new HashMap();
		
		/* Create a phone book with 2 arguments in parameter.  30 is the load factor.  
		 * It refers to the # of buckets that can be used before the capacity increases.  
		 * The value is  floating-point number ranging from 0 (empty) to 1.0 (full), 
		 * so a 0.7 means that when the buckets are 70 percent full, the capacity increases.  
		 */
		HashMap phonebook2 = new HashMap(30, 0.7F);
		
		// Creates a phone book with two attributes, a string attribute and a long attribute.  
		HashMap<String, Long> phonebook3 = new HashMap<>();
		
		/* Adds an object with string and long attribute to phonebook3.  
		 * Format:  HashMap_name.put(key, value);
		 */
		phonebook3.put("Butterball Turkey Line",  8002888372L);
		System.out.println(phonebook3);

		// Get the long number portion (key) of the object with the String value of "Butterball Turkey Line".  
		long number = phonebook3.get("Butterball Turkey Line");
		System.out.println(number);
		
		// If "Betty Crockre" is on the map, return its corresponding number, otherwise return -1.  
		long number2 = phonebook3.getOrDefault("Betty Crockre", -1L);
		System.out.println(number2);
		
		// Check if phonebook3 contains the key called "Betty Crockre".  
		boolean key = phonebook3.containsKey("Betty Crockre");
		System.out.println(key);
		
		// Checks if phonebook3 contains the value called "Butterball Turkey Line", which is false, since that String is the key.  
		boolean value = phonebook3.containsValue("Butterball Turkey Line");
		System.out.println(value);
		
		/** Now the long number is a value, so it prints true because the map does contain the value.  */
		boolean value2 = phonebook3.containsValue(8002888372L);
		System.out.println(value2);
		
		// Check the size of the hash map.  
		int size = phonebook3.size();
		System.out.println(size);
					
	}
	
}
