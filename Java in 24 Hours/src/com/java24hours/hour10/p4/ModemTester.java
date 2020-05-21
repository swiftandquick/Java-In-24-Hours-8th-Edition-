package com.java24hours.hour10.p4;

public class ModemTester {

	/* Only this class can be run, because it has a main block.  
	 * Classes in the same package can interact with each other.  
	 */
	
	public static void main(String[] arguments) {
		
		/* Create two new objects:  
		 * CableModem object called surfBoard.  
		 * DslModem object called gateway.  
		 * These lines called CableModem.java and DslModem.java,  
		 * which also inherited attributes and behaviors from Modem.java.  
		 */
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		Commodore64Modem c64modem = new Commodore64Modem();
		
		// Give those new objects the attribute of speed.  
		
		/**
		 * I set speed in Modem class to private for encapsulation purpose, so I can no
		 * longer access it this way.
		 */
		/*
		surfBoard.speed = 500000; 
		gateway.speed = 400000; 
		c64modem.speed = 300;
		*/
		
		/** Use setter in Modem class to get speed.  */
		surfBoard.setSpeed(500000);
		gateway.setSpeed(400000);
		c64modem.setSpeed(300);
		
		/* displaySpeed() is a behavior inherited from Modem.java.  
		 * connect() is a behavior inherited from CableModem.java and DslModem.java.  
		 */
		
		System.out.println("Trying the cable modem:  ");

		surfBoard.displaySpeed(); 
		surfBoard.connect(); 
		
		System.out.println("Trying the DSL modem:  ");
		
		gateway.displaySpeed();
		gateway.connect(); 
		
		System.out.println("Trying the Commodore 64 Modem:  ");
		
		c64modem.displaySpeed();
		c64modem.connect();
		c64modem.disconnect();
		
	}
	
}