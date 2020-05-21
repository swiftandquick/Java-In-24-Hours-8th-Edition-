package com.java24hours.hour11.p8;

public class Gremlin {

	private int guid;
	
	// The getter only returns guid if it's between 1,000,000 and 9,999,999.  
	public int getGuid() {
		return guid; 
	}
	
	public void setGuid(int newGuid) {
		this.guid = newGuid;
	}
	
}
