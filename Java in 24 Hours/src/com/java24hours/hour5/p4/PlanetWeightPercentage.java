package com.java24hours.hour5.p4;

public class PlanetWeightPercentage {

	public static void main(String[] arguments) {
		// .print doesn't start a new line.  
		System.out.print("Your weight on Earth is ");
		double weight = 100;
		// .println starts a new line.  
		System.out.println(weight + "%");
		
		System.out.print("Your weight on Mercury is ");
		double mercury = weight * .378;
		System.out.println(mercury + "%");
		
		System.out.print("Your weight on Moon is ");
		double moon = weight * .166;
		System.out.println(moon + "%");
		
		System.out.print("Your weight on Jupiter is ");
		double jupiter = weight * 2.364;
		System.out.println(jupiter + "%");
	}
	
}
