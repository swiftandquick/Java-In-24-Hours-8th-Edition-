package com.java24hours.hour7.p1;

public class IfStatements {

	public static void main(String[] arguments) {
		
		// If statements.  
		long account = -17_000_000_000_000L;
		if (account < 0) {
			System.out.println("Account overdrawn; you need a bailout");
		}
		if (account <= 0) {
			System.out.println("You are flat broke.");
		}
		
		// If statements.  
		int elephantWeight = 900;
		int elephantTotal = 13;
		int cleaningExpense = 200;
		if (elephantWeight > 780) {
			System.out.println("Elephant too big for tightrope act.");
		}
		if (elephantTotal > 12) {
			cleaningExpense = cleaningExpense + 150;
		}
		System.out.println("Cleaning Expense:  " + cleaningExpense);
		// If statement does not require a block statement.  
		if (account <= 0) System.out.println("No more Money.");
		
		// Equal and not equal comparisons.  
		char answer = 'b';
		char rightAnswer = 'c';
		int studentGrade = 85;
		if (answer == rightAnswer) {
			studentGrade = studentGrade + 10;
		}
		if (studentGrade == 100) {
			System.out.println("Show off!");
		}
		if (answer != rightAnswer) {
			studentGrade = studentGrade - 5;
		}
		System.out.println("Student Grade:  " + studentGrade);
		
		// Equal and not equal comparisons. 
		int total = 0;
		int score = 7;
		if (score == 7) {
			System.out.println("You score a touchdown!");
		}
		if (score == 3) {
			System.out.println("You kick a field goal!");
		}
		total = total + score;
		
		// More comparisons.  
		int playerScore = 12000;
		int playerLives = 3;
		int difficultyLevel = 10;
		
		if (playerScore > 9999) {
			playerLives++;
			System.out.println("Extra life!  " + playerLives + " lives!  ");
			difficultyLevel = difficultyLevel + 5;
		}
	}
	
}
