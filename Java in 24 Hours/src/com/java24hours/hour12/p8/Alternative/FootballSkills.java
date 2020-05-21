package com.java24hours.hour12.p8.Alternative;

import java.util.HashSet;

public class FootballSkills {
	
	private HashSet<String> basicSkills  = new HashSet<String>();
	
	public HashSet<String> addSkills() {
		basicSkills.add("Passing");
		basicSkills.add("Sight Keepnig");
		return basicSkills;
	}

}
