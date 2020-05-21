package com.java24hours.hour14.p6;

public class Throw {

	static void checkEligibility(int stuage, int stuweight) {
		// While 10 < 12 && 39 < 40 is true. We can throw an exception to make the
		// program have an error.  Then, we catch the exception that we throw.  
		try {
			if (stuage < 12 && stuweight < 40) {
				/** It's not ArithmeticException, but I just throw it as an error just in case.  */
				throw new ArithmeticException("Student is not eligible for registration.  ");
			} 
			else {
				System.out.println("Student Entry is valid!  ");
			}
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to the Registration process!");
		checkEligibility(10, 39);
		System.out.println("Have a nice day.  ");
	}

}
