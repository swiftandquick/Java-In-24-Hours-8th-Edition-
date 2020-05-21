package com.java24hours.hour12.p8;

public class FootballRole {

	public static void main(String args[]) {
		
		CommonSkill lineman = new SkillDefensive();
		CommonSkill wide_receiver = new SkillOffensive();
		CommonSkill tight_end = new SkillDefensive();
		CommonSkill running_back = new SkillOffensive();
		CommonSkill quarterback = new SkillStrategic();
		
		lineman.skill();
		tight_end.skill();
		wide_receiver.skill();
		running_back.skill();
		quarterback.skill();
		
	}
	
}
