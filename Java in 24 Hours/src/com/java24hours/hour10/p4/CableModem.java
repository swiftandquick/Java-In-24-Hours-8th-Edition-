package com.java24hours.hour10.p4;

// Class is inherited from Modem.java.  
public class CableModem extends Modem {
	
	private String method = "cable connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet...  ");
		System.out.println("Using a " + method);
	}
	
}
