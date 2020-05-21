package com.java24hours.hour12.p7;

@SuppressWarnings("serial")
public class Point4D extends Point3D {
	
	// Declare the new t (time) variable.  
	private int t;
	
	public Point4D(int x, int y, int z, int t) {
		super(x, y, z);
		this.t = t;
	}
	
	public int getT() {
		return t;
	}
	
	public void move(int x, int y, int z, int t) {
		this.t = t;
		super.move(x, y, z);
	}
	
	public void translate(int x, int y, int z, int t) {
		this.t += t;
		super.translate(x, y, z); 
	}

}
