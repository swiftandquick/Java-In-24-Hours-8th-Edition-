package com.java24hours.hour10.p4;

public class Commodore64Modem extends Modem {
	
	private String method = "Commodore 64 Modem Connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet...");
		System.out.println("Using a " + method); 
	}
	
	public void disconnect() {
		System.out.println("Too slow to load, disconnecting...  ");
	}

}
