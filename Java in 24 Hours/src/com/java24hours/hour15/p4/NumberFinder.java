package com.java24hours.hour15.p4;

/* Original file named PrimeFinder, found in page 205.  
 * Code run time is too long, not sure why.  
 */

/**
 * The interface is supported by a Runnable class. Thanks to the implementation,
 * I can use run() method in the program to make the program run again.  The 
 * program doesn't seem to execute properly, instead of using two threads to 
 * solve separate problems, the two threads solve both problems.  Hence, the 
 * process become a slower than just using one thread to solve both problems.  
 */
public class NumberFinder implements Runnable {
    Thread go; // For finding prime #.  
    Thread go2; // For finding numbers that aren't divisible by 3.  
    
    /* Creates a string buffer called primes.  
     * User can append new strings onto the existing string buffer.  
     */
    StringBuffer primes = new StringBuffer(); 
    
    /* Creates a string buffer called notDivisbleBy3.  
     * User can append new strings onto the existing string buffer.  
     */
    StringBuffer notDivisibleBy3 = new StringBuffer();
    
    int time = 0; 
 
    NumberFinder() {
        start();
        // While there is still prime number and number that is not divisible by 3.  
        while (primes != null && notDivisibleBy3 != null) {
            System.out.println(time);
            try {
            	// Prints out the time every 1000 milliseconds or one second.  
                Thread.sleep(1000);
            } 
            catch (InterruptedException exc) {
                // Do nothing.  
            }
            time++;
        }
    }
 
	/**
	 * Start the thread if it hasn't already. Starts two threads, one for finding
	 * prime numbers, the other for finding non-multiples of threes. Each has to
	 * find 1,000,000 numbers respective to their conditions, only when both
	 * conditions are reach, both threads stop.
	 */
    public void start() {
        if (go == null) {
            go = new Thread(this);
            go.start();
        }
        if (go2 == null) {
            go2 = new Thread(this);
        	go2.start();
        }
    }
 
	/**
	 * run() is not being invoke manually, but when the thread starts via start()
	 * method, the run() method will begin to execute. Object's run method to be
	 * called in that separately executing thread. I supposed both threads help to
	 * execute this part of the program, I am not entirely sure yet.
	 */
    public void run() {
        int quantity = 1_000_000;
        
        // Finding the first one million prime numbers.  
        int numPrimes = 1;
        // Candidate: the number that might be prime.  
        int candidate = 2;
        // Append strings into existing string buffer.  
        primes.append("\nFirst ").append(quantity).append(" primes:  \n\n");
        /* Simply put, find one million prime numbers, 
         * and appending each new number onto the existing string.  
         */
        while (numPrimes <= quantity) {
            if (isPrime(candidate)) {
                primes.append(candidate).append(" ");
        		/** Skips a line for 20 numbers will make the console window print properly.  */
                if (numPrimes % 20 == 0) {
                	primes.append("\n");
                }
                numPrimes++;
            }
            candidate++;
        }
        
        // Finding the first one million numbers that aren't divisible by 3.  
        int numNotDivisibleBy3 = 1;
        // The first number that isn't divisible by 3 is 1.  
        int candidate2 = 1;
        // Append strings into existing string buffer.  
        notDivisibleBy3.append("\nFirst ").append(quantity).append(" numbers that are divisible by 3:  \n\n"); 
        /* Simply put, find one million numbers that are not divisible by 3, 
         * and appending each new number onto the existing string.  
         */
        while (numNotDivisibleBy3 <= quantity) {
        	if (isNotDivisibleBy3(candidate2)) {
        		notDivisibleBy3.append(candidate2).append(" ");
        		/** Skips a line for 20 numbers will make the console window print properly.  */
        		if (numNotDivisibleBy3 % 20 == 0) {
        			notDivisibleBy3.append("\n");
        		}
        		numNotDivisibleBy3++;  
        	}
        	candidate2++;
        }
        
        System.out.println(primes);
        primes = null;
        System.out.println(notDivisibleBy3);
        notDivisibleBy3 = null; 
        System.out.println("\nTime elapsed: " + time + " seconds.  ");
    }
 
    // Check if the "candidate" number is prime.  
    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Check if "candidate2" number is divisible by 3.  
    public static boolean isNotDivisibleBy3(int checkNumber2) {
    	for (int i = 1; i <= checkNumber2; i++)
    		if (checkNumber2 % 3 == 0) {
    			return false;
    		}
    		return true;
    }
    
    public static void main(String arguments[]) {
        new NumberFinder();
    }
}