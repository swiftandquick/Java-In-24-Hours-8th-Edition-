package com.java24hours.hour12.p8.Alternative;

public class PackageDemo {

	public static void main(String args[]) {
		
		AdvanceFootballSkills james = new AdvanceFootballSkills("James Green", "Lineman");
		AdvanceFootballSkills wilder = new AdvanceFootballSkills("Wilder Block", "Tight End");
		AdvanceFootballSkills elisa = new AdvanceFootballSkills("Elisa Smith", "Wide Receiver");
		AdvanceFootballSkills chang = new AdvanceFootballSkills("Chang Guan", "Running Back");
		AdvanceFootballSkills noah = new AdvanceFootballSkills("Noah Singh", "Quarter Back");
		
		/** Add appropriate skill sets to the players.  */
		james.DefensiveSkills();
		wilder.DefensiveSkills();
		elisa.OffensiveSkills();
		chang.OffensiveSkills();
		noah.StrategicSkills();
		
		/** Prints out the objects (players) and their corresponding role and skills.  */
		System.out.println(james);
		System.out.println(wilder);
		System.out.println(elisa);
		System.out.println(chang);
		System.out.println(noah);
		
	}
	
}
