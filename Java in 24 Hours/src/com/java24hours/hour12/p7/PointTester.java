package com.java24hours.hour12.p7;

import java.awt.Point;

public class PointTester {

	public static void main(String[] arguments) {

		/**
		 * x, y are variables from the Point class, and I imported the Point class, so I
		 * also share the x, y values. However, the z and t variables are set private
		 * int Point3D and Point4D classes respectively.  So, I have to use the getter 
		 * methods getZ() and getT() to retrieve their values.  
		 */
		
		// For pointers, object's attributes are x, y, and z coordinates.  
		
		// Use object to create a point with x and y coordinates.  
		Point location1 = new Point(11, 22);
		
		// Use object to create a point with x, y, and z coordinates.  
		Point3D location2 = new Point3D(7, 6, 64);
		
		// Use object to create a point with x, y, z coordinates and time.  
		Point4D location3 = new Point4D(15, 25, 18, 30); 

		// Use ".move" to move location 1 to 4, 13.  
		System.out.println("The 2D point is at (" + location1.x + ", " + location1.y + ")");
		System.out.println("It's being moved to (4, 13)"); 
		location1.move(4, 13); 
		System.out.println("The 2D point is now at (" + location1.x + ", " + location1.y + ")");
		
		// Move 2D pointer (location1) to (4 - 10, 13 - 10), which should be (-6, 3).  
		System.out.println("It's being moved -10 units on both the x " + "and y axes");
		location1.translate(-10, -10);;
		System.out.println("The 2D point ends up at (" + location1.x + ", " + location1.y + ")\n");

		// Move 3D pointer (location2) to a new location.  
		System.out.println("The 3D point is at (" + location2.x + ", " + location2.y + ", " + location2.getZ() + ")");
		System.out.println("It's being moved to (10, 22, 71)");
		location2.move(10, 22, 71);
		System.out.println("The 3D point is now at (" + location2.x + ", " + location2.y + ", " + location2.getZ() + ")");
		System.out.println("It's being moved -20 units on the x, y " + "and z axes");
		System.out.println("The 3D point ends up at (" + location2.x + ", " + location2.y + ", " + location2.getZ() + ")");
		
		// Current 4D point location3's location.  
		System.out.println("\nCurrent 4D Point Location:  (" + 
				location3.x + ", " + location3.y + ", " + location3.getZ() + ", " + location3.getT() + ").  "); 
		
		// Move the location3 to a new coordinate.  
		location3.move(16, 19, 21, 36);
		System.out.println("Moved 4D Point Location:  (" + 
				location3.x + ", " + location3.y + ", " + location3.getZ() + ", " + location3.getT() + ").  "); 
		
		location3.translate(11, 12, 13, 12);
		if (location3.getT() >= 0) {
			System.out.println("Translated 4D Point Location:  (" + 
				location3.x + ", " + location3.y + ", " + location3.getZ() + ", " + location3.getT() + ").  ");
		}
		else {
			System.out.println("Time cannot be negative.  ");
		}
		
		// Time cannot be negative.  
		location3.translate(-2, -3, -5, -60);
		if (location3.getT() >= 0) {
			System.out.println("Translated 4D Point Location:  (" + 
				location3.x + ", " + location3.y + ", " + location3.getZ() + ", " + location3.getT() + ").  ");
		}
		else {
			System.out.println("Time cannot be negative.  ");
		}
		
	}
	
}