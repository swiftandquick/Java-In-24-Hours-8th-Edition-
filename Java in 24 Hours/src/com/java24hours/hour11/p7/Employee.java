package com.java24hours.hour11.p7;


/* There are three types of constructors in Java.  
 * This is a parameterized constructor.  
 */ 

public class Employee {

	/** Instance variables should be set to private.  */
	private int empId; 
	private String empName; 
	
	// Parameterized constructor with two parameters.  
	Employee(int id, String name) {
		// "this" sets the variables for undefined local empId and empName.  
		this.empId = id;
		this.empName = name;
	}
	
	void info() {
		System.out.println("Id:  " + empId + " Name:  " + empName); 
	}
	
	public static void main(String args[]){
		// Pass an integer and a String variable to the constructor.  
		Employee obj1 = new Employee(10245, "Chaitanya");
		Employee obj2 = new Employee(92232, "Negan");
		
		// Run the info() method using the objects' information.  
		obj1.info(); 
		obj2.info(); 
	}
	
}

/* The third type of constructor is default constructor.  
 * If I haven't implement any constructor, 
 * Java compiler will automatically insert 
 * a default constructor on my behalf.  
 */ 