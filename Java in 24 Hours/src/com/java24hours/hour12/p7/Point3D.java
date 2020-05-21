package com.java24hours.hour12.p7;

import java.awt.*;

/* The subclass Point is already included in the java.awt.* package.  
 * The Point3D class of objects can do three things:  
 * 1.  Keep track of an object's (x, y, z) coordinate.  
 * 2.  Move an object to a new (x, y, z) coordinate.  
 * Movement an object by a specified amount of x, y, and z values.  
 */

@SuppressWarnings("serial")
public class Point3D extends Point {

	/* Declare z coordinate variable because 
	 * superclass Point only has x and y coordinates.  
	 */
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void move(int x, int y, int z) {
		this.z = z;
		super.move(x, y);
	}
	
	public void translate(int x, int y, int z) {
		this.z += z;
		super.translate(x, y);
	}
	
}