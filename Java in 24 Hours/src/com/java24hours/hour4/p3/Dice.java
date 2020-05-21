package com.java24hours.hour4.p3;

// Hour 4

/* Import Java classes from the Java library.  
 * For more information, visit:  
 * https://docs.oracle.com/javase/7/docs/api/
 */
import java.util.*;

public class Dice {

	public static void main(String[] arguments) {
		// Random is a class, generator is the object.  
		Random generator = new Random();
		int value = generator.nextInt(); // Any value.  
		System.out.println("The random number is " + value);
		int value2 = generator.nextInt(5);
		System.out.println("The random number is " + value2); // 0 to 4
		int value3 = generator.nextInt(5) + 1;
		System.out.println("The random number is " + value3); // 1 to 5
		int value4 = generator.nextInt(5) * 2;
		System.out.println("The random number is " + value4); // 0 to 8
		int value5 = (generator.nextInt(5) + 1) * 2;
		System.out.println("The random number is " + value5); // 2 to 10
	}
}
