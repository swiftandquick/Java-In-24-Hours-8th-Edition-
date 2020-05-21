package com.java24hours.hour9.p3;

import java.util.*;

public class NameSorter {

	public static void main(String[] arguments) {
		String names[] = { "Glimmer", "Marvel", "Rue", "Clove", 
			"Thresh", "Foxface", "Cato", "Peeta", "Katniss" };
		System.out.println("The original order:  ");
		// Use for loop to print out individual indexes according to index order.  
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ":  " + names[i]);
		}
		System.out.println();
		
		Arrays.sort(names); // Automatically alphabetical sorting.  
		System.out.println("The new order:  ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ":  " + names[i]);
		}
		System.out.println();
		
	}
	
}
