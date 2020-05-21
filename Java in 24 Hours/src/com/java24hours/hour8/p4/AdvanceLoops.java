package com.java24hours.hour8.p4;

public class AdvanceLoops {

	public static void main(String[] arguments) {
		
		/* Nested loops and naming the loop.  
		 * The following while loop never ends, 
		 * since conditional statement is always true.  
		 * Name the loop then exit it via break.  
		 */
		int points = 0;
		int target = 100;
		
		targetLoop: 
		while (target <= 100) {
			for (int i = 0; i < target; i++) {
				// Exit the targeted loop rather than the for loop when points become > 50.  
				if (points > 50) {
					break targetLoop;
				}
				System.out.print(points + " ");
				// Keep adding "i" points for each loop, i increments each loop.  
				points = points + i;
			}
		}
		System.out.println();
		
		/* For loops can have more than one initialized variables.  
		 * This is an example of a complex for loop:  
		 */
		int i, j;
		for (i = 0, j = 0; i * j < 1000; i++, j += 2) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
		
		/* If initial variable is already declared, 
		 * you don't need to do it again in for loop. 
		 */
		int displayCount = 1;
		int endValue = 13;
		for (; displayCount < endValue; displayCount++) {
			System.out.print(displayCount + " ");
		}
		System.out.println();
		
	}
	
}
