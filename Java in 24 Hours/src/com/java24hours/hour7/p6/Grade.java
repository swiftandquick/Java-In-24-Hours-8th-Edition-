package com.java24hours.hour7.p6;

public class Grade {

	public static void main(String[] arguments) {
		int grade = 86;
		
		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// Since grade is an integer, the result is the floor of the closest integer, which is 8.  
		switch (grade / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		}
	}
	
}
