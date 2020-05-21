package com.java24hours.hour13.p2;

import java.awt.*;
import java.util.*;

public class Battlepoint {

	/* The following array list can hold Point or any other class of objects.  
	 * Java compiler won't allow any class other than Point or its subclasses to be added to the array list.  
	 */
	ArrayList<Point> targets = new ArrayList<Point>();
	
	/** Constructor, well, this really is just for invoking methods.  */
	Battlepoint() {
		// Creates targets to shoot at.  
		createTargets();
		// Displays the game map.  
		showMap();
		/* Shoot at three points.  
		 * Call the shoot method three times.  
		 */
		shoot(7, 4); 
		shoot(3, 3); 
		shoot(9, 2);
		/* Display the map again.  
		 * This time, without the destroyed target.  
		 */
		showMap();
	}
	
	private void showMap() {
		System.out.println("\n   1  2  3  4  5  6  7  8  9");
		for (int row = 1; row < 10; row++) {
			for (int column = 1; column < 10; column++) {
				if (column == 1) {
					System.out.print(row + " ");
				}
				System.out.print(" ");
				/* Creates a point object called cell, it has 
				 * row and column as x and y coordinates.  
				 */
				Point cell = new Point(column, row);
				/* The condition is true if cell's index matches one of targets' (ArrayList)
				 * indices. I have 3 indices in targets ArrayList, so if the Point "cell"
				 * matches any one of them (0, 1, 2), which are all greater than -1, then I put
				 * "X" in here instead of ".".
				 */
				if (targets.indexOf(cell) > -1) {
					// Mark the position as "X".  
					System.out.print("X");
				}
				else {
					// No target is here.  
					System.out.print(".");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/* The targets array list has 3 Point objects, .  
	 * Index 1 stores the point (3, 9).  
	 * Index 2 stores the point (4, 5).
	 * Index 3 stores the point (9, 2). 
	 */
	private void createTargets() {
		Point p1 = new Point(5, 9);
		targets.add(p1);
		Point p2 = new Point(4, 5);
		targets.add(p2);
		Point p3 = new Point(9, 2);
		targets.add(p3);
	}
	
	/* Takes in parameter arguments from Battlepoint() class.  
	 * 
	 */
	private void shoot(int x, int y) {
		Point shot = new Point(x, y);
		System.out.print("Firing at (" + x + ", " + y + ") ...");
		/**
		 * If the targets ArrayList contains the a Point in one of its indices (0, 1, or
		 * 2), which are all more than -1, then I call the remove the element (Point) 
		 * from the targets ArrayList.  
		 */
		if (targets.indexOf(shot) > -1) {
			System.out.println("You sank my battlepoint!");
			// Delete the destroyed target.  
			targets.remove(shot);
		}
		else {
			System.out.println("Miss.  ");
		}
	}
	
	public static void main(String[] arguments) {
		new Battlepoint();
	}
	
}
