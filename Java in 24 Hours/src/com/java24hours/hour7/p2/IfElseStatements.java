package com.java24hours.hour7.p2;

public class IfElseStatements {

	public static void main(String[] arguments) {
		
		// If-else statement.  
		int score = 0;
		int answer = 17;
		int correctAnswer = 13;
		if (answer == correctAnswer) {
			score += 10;
			System.out.println("Current score:  " + score);
			System.out.println("That's right.  You get 10 points.");
		} else {
			score -= 5;
			System.out.println("Sorry, that's wrong.  You lose 5 points.");
		}
		
		// Utilizing "else if".  
		char grade = 'A';
		if (grade == 'A' ) {
			System.out.println("You got an A.  Awesome!");
		} else if (grade == 'B') {
			System.out.println("You got a B.  Beautiful!");
		} else if (grade == 'C') {
			System.out.println("You got a C.  Concerning!");
		} else {
			System.out.println("You got an F.  ");
		}
		
		// Ternary operator.  
		int skillLevel = 10;
		int numberOfEnemies;
		/* Check whether the conditional statement within the parenthesis is true or false.  
		 * variable = (conditional statement) ? new value if is true : new value if false.  
		 */
		numberOfEnemies = (skillLevel > 5) ? 20 : 10;
		System.out.println("Skill Level:  " + skillLevel + "\nNumber of Enemies:  " + numberOfEnemies);
		
		// Another Ternary operator. 
		String gender = "female";
		System.out.println( (gender.contentEquals("female")) ? "Ms." : "Mr." );
	}
	
}
