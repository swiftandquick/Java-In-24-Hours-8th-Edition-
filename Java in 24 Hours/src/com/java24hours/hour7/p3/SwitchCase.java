package com.java24hours.hour7.p3;

public class SwitchCase {

	public static void main(String[] arguments) {
		
		char grade = 'B';
		
		switch (grade) {
			case 'A':
				System.out.println("You got an A.  Awesome!");
				break;
			case 'B':
				System.out.println("You got a B.  Beautiful!");
				break;
			case 'C':
				System.out.println("You got a C.  Concerning!");
				break;
			default:
				System.out.println("You got an F.  ");
		}
		
	}
	
}