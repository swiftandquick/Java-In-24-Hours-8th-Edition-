package com.java24hours.hour4.p2;

// Hour 4

/* 
 * Initially, the output results in error due to no arguments being specified.  (Page 44)
 * Go to Run, Run Configurations, Arguments.  
 * Enter program arguments as "retromingent purple lactose-intolerant".  
 * Now there are customized arguments, the error no longer presents. 
 * */

public class BlankFiller {
	public static void main(String[] arguments) {
		System.out.println("The " + arguments[0] 
				+ " " + arguments[1] + " fox "
				+ "jump over the " + arguments[2] + " dogs.");
	}
}