package com.java24hours.hour8.p5;

public class Benchmark {

	public static void main(String[] arguments) {
	
		// Get the current time in milliseconds.  
		long startTime = System.currentTimeMillis();
		// End time is 60000 milliseconds or a minute from now.  
		long endTime = startTime + 60000;
		long index = 0;
		
		/**
		// While loop will run forever unless we break it.  
		while (true) {
			double x = Math.sqrt(index); // Not sure what this is for.  
			// System.out.println(index);
			// Get the current time in milliseconds.  
			long now = System.currentTimeMillis();
			if (now > endTime) {
				break; // Breaks the while loop once current time passes the end time.  
			}
			index++;
		}
		*/
		
		long now = startTime;
		while (now < endTime) {
			now = System.currentTimeMillis();
			index++;
		}
		
		// Outcome will print if you wait for one minute.  
		System.out.println(index + " loops in one minute.");
	}
	
}
