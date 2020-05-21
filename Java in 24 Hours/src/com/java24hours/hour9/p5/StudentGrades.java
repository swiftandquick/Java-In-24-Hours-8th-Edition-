package com.java24hours.hour9.p5;

public class StudentGrades {

	public static void main(String[] arguments) {
		String[] studentNames = { "Charlotte", "Jeffrey", "Christopher", "Jarett" };
		// grade[student number][student grade]
		int[][] grade = { { 86, 82, 91, 99 }, 
				{ 87, 87, 89, 87 }, 
				{ 97, 91, 96, 93 }, 
				{ 53, 67, 77, 85 } };
		int sum, average, studentCount, tests;
		
		System.out.println("Student:  \tTest 1\tTest 2\tTest 3\tTest4\tAverage");
		for (studentCount = 0; studentCount < grade.length; studentCount++) {
			sum  = 0; // Resets the average to 0 for every new student.  
			System.out.print(studentNames[studentCount] + ":  \t");
			for (tests = 0; tests < grade[0].length; tests++) {
				System.out.print(grade[studentCount][tests] + "\t");
				sum = sum + grade[studentCount][tests];
			}
			average = sum / tests;
			System.out.print(average + "\t");
			System.out.println();
		}
	}
	
}
