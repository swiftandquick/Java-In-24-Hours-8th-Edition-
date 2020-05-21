package com.java24hours.hour15.p1;

/* The interface is supported by a Runnable class.  
 * Thanks to the implementation, I can use run() 
 * method in the program to make the program run again.  
 */
public class PrimeFinder implements Runnable {
	
    Thread go; // For finding prime #.  
    
    /* Creates a string buffer called primes.  
     * User can append new strings onto the existing string buffer.  
     */
    StringBuffer primes = new StringBuffer(); 
    
    /* Creates a string buffer called notDivisbleBy3.  
     * User can append new strings onto the existing string buffer.  
     */
    StringBuffer notDivisibleBy3 = new StringBuffer();
    
    /** The variable time starts as 0, then increments by 1 every second (1000 milliseconds).  */
    int time = 0; 
 
    /** Constructor, but in reality it's just for main method to invoke it once.  */
    PrimeFinder() {
        start();
        // While there is still prime number and number that is not divisible by 3.  
        while (primes != null) {
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
 
    // Start the thread if it hasn't already.  
    public void start() {
        if (go == null) {
            go = new Thread(this);
            go.start();
        }
    }
    
    
	/**
	 * run() is not being invoke manually, but when the thread starts via start()
	 * method, the run() method will begin to execute. 
	 */
    public void run() {
        
		/**
		 * 1_000_000 is too big of a number, it works, but I can try 1000.  
		 */
    	int quantity = 1000000;
        // int quantity = 1000;
        
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
        	/** If a prime number is found, increment the numPrimes value by 1, 
        	 * while loop will continue until numPrimes reaches 1 million.  */
            if (isPrime(candidate)) {
                primes.append(candidate).append(" ");
                /** Adds a line skip every for every 20 prime numbers append to the string.  
                 * Without line skipping, the program will not run because the String is 
                 * too long and the width limit of the console is too short.  */
                if (numPrimes % 20 == 0) {
                	primes.append("\n");
                }
                numPrimes++;
            }
            /** candidate will also keep increment until numPrimes surpass quantity.  */
            candidate++;
        }
        
        System.out.println(primes);
        primes = null;
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
       
    public static void main(String[] arguments) {
        new PrimeFinder();
    }
}