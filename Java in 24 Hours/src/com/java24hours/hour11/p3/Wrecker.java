package com.java24hours.hour11.p3;

public class Wrecker {

	/** Instance variables must be static for main method to use it.  */
	private static String CREATOR = "Phoebe Cates";
	
	public static void main(String args[]) {
		
		System.out.println(CREATOR + " created a huge crater!  ");
		
		/**
		 * I can't access to the destroy() method without making destroy() static, but I
		 * don't want to do that. I can still access that method by creating an object
		 * first.  Then, I can use the object to call the destroy method.  
		 */
		Wrecker wrecker = new Wrecker();
		
		wrecker.destroy();
	}
	
	public void destroy() {
		
		// Assigns the value 1024 as GremlinCode's size.  
		GremlinCode gc = new GremlinCode(1024);
		gc.writeOutput();
	}
	
	/* Creates a GremlinCode object.  
	 * GremlinCode is a helper class (inner class).  
	 * Helper class are in the same source code file as the class they are assisting (Wrecker).  
	 */
	class GremlinCode {
		int vSize;
		
		/** Constructor.  */
		GremlinCode(int size) {
			vSize = size;
		}
		
		public void writeOutput() {
			System.out.println("Size of the crater:  " + vSize);
		}
		
	}
	
}
