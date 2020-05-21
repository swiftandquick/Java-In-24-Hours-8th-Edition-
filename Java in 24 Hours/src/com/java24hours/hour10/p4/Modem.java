package com.java24hours.hour10.p4;

/* Modem is a superclass that is being inherited by 
 * subclasses such as CableModem and DslModem.  
 */

public class Modem {

	private int speed; 
	
	/* This file compiled automatically as Modem.class.  
	 * It cannot run directly, but can be used in other classes.  
	 */
	Modem() {
		speed = 0;
	}
	
	Modem(int rSpeed) {
		speed = rSpeed;
	}
	
	public void setSpeed(int rSpeed) {
		this.speed = rSpeed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void displaySpeed() {
		System.out.println("Speed:  " + speed);
	}
	
}
