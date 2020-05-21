package com.java24hours.hour12.p8.Alternative;

import java.util.HashSet;

public class AdvanceFootballSkills extends FootballSkills {

	private String name, role;
	
	/** Use HashSet rather than ArrayList to prevent duplicated skills.  */
	private HashSet<String> skills = new HashSet<String>();
	
	AdvanceFootballSkills() {
		name = "?";
		role = "?";
		skills = addSkills();
	}
	
	AdvanceFootballSkills(String rName, String rRole) {
		name = rName;
		role = rRole;
		/** By default, the players inherit basic skills from superclass.  */
		skills = addSkills();
	}
	
	public void setName(String rName) {
		this.name = rName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRole(String rRole) {
		this.role = rRole;
	}
	
	public String getRole() {
		return role;
	}
	
	public void DefensiveSkills() {
		skills.add("Blocking");
	}
		
	public void OffensiveSkills() {
		skills.add("Speed");
	}
		
	public void StrategicSkills() {
		skills.add("Playing Calling");
	}
	
	public String toString() {
		String playerDetails = "Player[Name = " + name + ", Role = " + role + ", Skills[ - ";
		for (String skill : skills) {
			playerDetails = playerDetails + skill + " - ";
		}
		playerDetails = playerDetails + "]]";
		return playerDetails;
	}
	
}
