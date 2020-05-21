package com.java24hours.hour8.p3;

public class WhileAndDoWhile {

	public static void main(String[] arguments) {

		int limit = 5;
		int count = 1;
		while (count < limit) {
			/* The statements inside the loop goes here.
			 * It will loop 4 times when count as 1, 2, 3, 4.  
			 */
			System.out.println("Pork is not a verb.");
			count++;
		}
		
		/* Unlike while loops, do-while loops' conditional test is 
		 * constructed after the statements inside the loop.  
		 * The inside statements still runs once even though 
		 * conditional statement fails, since 6 is not less than 5,  
		 * that's because in do while loops, inside statements
		 * run at least once because conditional statements come after.  
		 */
		int limit2 = 5;
		int count2 = 6;
		do {
			System.out.println("I am not allergic to long division.");
			count2++;
		} while (count2 < limit2);
		
		/* Use break to exit out of a loop immediately. 
		 * Break is applicable on all loops.  
		 */
		int index = 0;
		while (index <= 1000) {
			index = index + 5;
			if (index == 400) {
				break;
			}
			System.out.print(index + " ");
		}
		System.out.println();
		
		/* Continue statement causes the loop to go back to
		 * the while statement instead of proceeding normally.  
		 * Thus, 400 is skipped, so isn't being printed.  
		 * Continue is applicable on all loops.  
		 */
		int index2 = 0;
		while (index2 <= 1000) {
			index2 = index2 + 5;
			if (index2 == 400) {
				continue;
			}
			System.out.print(index2 + " ");
		}
		System.out.println();
		
	}
	
}