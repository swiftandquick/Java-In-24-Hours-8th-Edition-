package com.java24hours.hour11.p1.alternative;

public class Gremlin {

	private String creator;
	private int maximumAge; 
	private int gremlinCount;
	
	Gremlin() {
		creator = "";
		maximumAge = 0;
		gremlinCount = 0;
	}
	
	Gremlin(String rCreator, int rMaximumAge) {
		creator = rCreator; 
		if (maximumAge < 0) {
			System.out.println("Age can't be negative!  "
					+ "\nResetting maximum age to 0.  ");
			maximumAge = 0;
		}
		else {
			maximumAge = rMaximumAge; 
		}
		gremlinCount = 1;
	}
	
	public void createGremlin(int age) {
		if (age > maximumAge) {
			maximumAge = age;
		}
		gremlinCount++;
	}
	
	public void writeOutput() {
		System.out.printf("%s created %d gremlin(s), the longest living gremlin "
				+ "was %d year(s) old.  \n", creator, gremlinCount, maximumAge);
	}
	
}
