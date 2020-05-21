package com.java24hours.hour15.p5;

import java.util.Random;

/* Each thread handles a task, multithreading handles multiple tasks simultaneously.  
 * Runnable is an interface that allows the run() method.  
 */
public class Tuna implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public Tuna(String x) {
		// The string x is taken from the argument.  
		name = x; 
		// String execution duration is between 1 to 999 milliseconds.  
		time = r.nextInt(999); 
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time); 
			Thread.sleep(time);
			System.out.printf("%s is done\n", name); 
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
}
