package com.java24hours.hour10.p4;

// Class is inherited from Modem.java.  
public class DslModem extends Modem {

	private String method = "DSL phone connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet ...");
		System.out.println("Using a " + method);
	}
	
}
