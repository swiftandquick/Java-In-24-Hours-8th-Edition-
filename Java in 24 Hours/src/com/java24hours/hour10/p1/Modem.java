package com.java24hours.hour10.p1;

// Creating a simple object via class.  

public class Modem {

	private int speed; // Attribute of an object.  
	
	/** Default constructor, this is not invoked.  */
	Modem() {
		speed = 0;
	}
	
	/** Construct that takes in speed, and sets in speed equal to parameter argument.  */
	Modem(int rSpeed) {
		speed = rSpeed;
	}
	
	/** Behavior of an object.  In this case, the speed attribute of the Object device is print out.  */
	public void displaySpeed() {
		System.out.println("Speed:  " + speed);
	}
	
	// Creating a new object:  device.  
	public static void main(String args[]) {
		
		/** Creates a Modem object called device, pass 500 as the speed to parameter.  */
		Modem device = new Modem(500);
		
		/** Object device calls the void method for printing.  */
		device.displaySpeed();
	}
	
}
