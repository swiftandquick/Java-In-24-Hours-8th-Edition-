package com.java24hours.hour9.p1;

public class DeclaringArrays {

	public static void main(String[] arguments) {
		
		// Declares an empty array with up to 250 elements.  
		int [] elfSeniority = new int [250];
		
		// Uses braces to create declare array elements.  
		String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen" };
		
		// Assigning variable.  Replaces 5th index (index #4), which is Comet, with Pip.  
		reindeerNames[4] = "Pip";
		
		// Find out the number of elements in the array reindeerNames.  		
		System.out.println(reindeerNames.length);
		
		// Arrays can  be multidimensional, I created a 50x50 array and give 3 indexes values.  
		boolean[][] selectedPoint = new boolean[50][50];
		selectedPoint[4][13] = true;
		selectedPoint[7][6] = true;
		selectedPoint[11][22] = true;
		
		// Sorting an array.  Here, I switched index #5 and index #6.  
		int [] numbers = { 3, 7, 9, 12, 5, 0, 8, 19 };
		int temporary = numbers[5];
		numbers[5] = numbers[6];
		numbers[6] = temporary;
	}
	
}
