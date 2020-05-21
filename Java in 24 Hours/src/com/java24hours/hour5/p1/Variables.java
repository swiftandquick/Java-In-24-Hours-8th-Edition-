package com.java24hours.hour5.p1;

public class Variables {
	
	public static void main(String[] arguments) {
		int tops; // Integers from -2147483648 to 2147483648. 
		float gradePointAverage; // Stores decimals.  Hold up to 38 (?) figures.  
		char key = 'C'; // Stores a character, use single quotation mark.  
		String productName = "Larvets"; // Stores a String (array of characters), use double quotation mark.  
		
		byte escapeKey = 27; // Holds integers from -128 to 127.  
		short roomNumber = 222; // Integers from -32768 to 32767.  
		long salary = 264_400_000_000L; // Integers from -9.22 quintillion to 9.22 quintillion, can use "_" to organize.  
		boolean gameOver = false; // Booleans are either true or false.  
		
		int allTimeHighScore; // Variable cannot have space in-between.  
		double pi = 3.14; // Stores a decimals.  Longer version of float.  
		
		// Assigning values.  
		int mileage = 300;
		int totalMileage = mileage; 
		
		float pi_2 = 3.14F; // Append a letter to a numeric value to indicate the value's type.  
		
		// The following are constant variables that cannot be changed.  
		// As in tradition, final variables are usually written in all caps.  
		final int TOUCHDOWN = 6;
		final int FIELDGOAL = 3;
		final int CONVERSION = 2;
		final int PAT = 1;
		
		// Binary values:  put 0b in front of the number.  
		int bi = 0b0000_1101; // bi is equivalent to 13.  
		
		// Hexadecimal values:  put 0x in front of the number.  
		int hex = 0x1C; // hex is equivalent to 28.  
	}
	
}