package com.java24hours.hour11.p4;

public class GremlinLab {

	/* 1.  Go to Run, then Run Configuration.  
	 * 2.  Enter com.java24hours.hour11.p4.GremlinLab as the Main Class.  
	 * 3.  Click on the Arguments tab, then enter 10 in the Program Arguments field.  
	 * 4.  Click OK to close the dialog.  
	 * Note:  If the number put in the argument field is too big, then it may 
	 * have slow output.  Because the compiler will count the array indexes one by one.  
	 */
	
	public static void main(String[] arguments) {
		
		// Cast the string input "10" to become integer 10.  
		int numGremlins = Integer.parseInt(arguments[0]);
		if (numGremlins > 0) {
			
			/* An array of Gremlin objects created with the 
			 * numGremlins variable determining the number of objects in the array.  
			 */ 
			Gremlin[] gremlins = new Gremlin[numGremlins];
			
			/* Call the constructor method.  
			 * For each Gremlin object in the array, 
			 * add 1 to the gremlinCount value; 
			 */
			for (int i = 0; i < numGremlins; i++) {
				gremlins[i] = new Gremlin();
			}
			
			// Call the getter method, the method will return the gremlinCount value.  
			System.out.println("There are " + Gremlin.getGremlinCount() + " gremlins.  ");
		}
		
	}
	
}
