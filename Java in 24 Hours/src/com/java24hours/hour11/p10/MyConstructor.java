package com.java24hours.hour11.p10;

public class MyConstructor {

	private int x = 5;
	
	/* This method is called second.  
	 * Since this is a no-argument constructor.  
	 * x by default is 5, a local variable.  
	 * The last thing that prints out is "-x5".  
	 */
	MyConstructor() {
		System.out.print("-x" + x);
	}

	/* This method is called first.  
	 * Due to the "this()" line, the method is rerun.  
	 * x is initially 5.  Thus, "-x5" was printed first.  
	 * Then, the mc1 object passes 4 as the parameter.  
	 * x is now 4.  Then, "-x" was printed second.  
	 */
	MyConstructor(int x) {
		this();
		System.out.print("-x" + x);
	}
	
	public static void main(String args[]) {
		
		/* In Java, main method is always being read first.  
		 * Creates an object mc1, passes in one parameter, 
		 * since second method only has 1 parameter, 
		 * it passes to the second method MyConstructor(int x).  
		 */
		MyConstructor mc1 = new MyConstructor(4); 
		
		// Creates an object mc2, passes in no parameter.  
		MyConstructor mc2 = new MyConstructor(); 
		
	}
	
}
