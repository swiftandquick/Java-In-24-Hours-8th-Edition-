package com.java24hours.hour5.p5;

public class LongerExpression {
	public static void main(String[] arguments) {
		int x = 3;
		int y = 2;
		int total;
		/* Shorter solution:  
		 * total = x * x + y * y; 
		 * We want a longer solution!  
		 */
		/** Most Math methods return double by default, so casting is needed.  */
		total = (int) (Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(total);
	}
}