package com.java24hours.hour16.p6;

/* Java program to demonstrate lambda expressions 
/* to implement a user defined functional interface. 
 */

interface FunctionInterface {
	
	/**
	 * int type doesn't have to be named "x" for the function to be invoked. This is
	 * an abstract functions, they normally don't have a body, but I can give them a
	 * better purpose via codes inside body of Lambda Expression.
	 */
	void abstractFunction(int x);
	
	/**
	 * Default method works like regular methods, but it's for methods with bodies
	 * interface.  I have to declare default before the method for it to work.  
	 */
	default void normalFunction() {
		System.out.println("Hello");
	}
	
}

class LambdaExpression {
	public static void main(String args[]) {
		/** Lambda Expression Format:  
		 * Object_Class_Name Object_Name -> Argument_List -> Body_of_Lamba_Expression;
		 * Below is what we called Lambda expression. I created an FunctionInterface
		 * object called fobj. Then, I write "= (int x)", and that's the argument.  
		 * It means that if there is a method in FunctionInterface fobj that also takes 
		 * integer primitive type as an argument, it will invoke the code in the body 
		 * of the Lambda expression.  In this case, the body instructs us to print out 
		 * the result of the integer I put in the parameter times 2.  
		 */
		FunctionInterface fobj = (int x) -> System.out.println(2 * x);
		
		/**
		 * This passes 5 to abstractFunction(), then executes the code inside body of
		 * lambda expression, which prints 10.
		 */
		fobj.abstractFunction(5);
		
		/** 
		 * This will just invoke the normalFunction() method.  Since I didn't pass in 
		 * the integer as argument.  The code inside the body of Lambda Expression 
		 * doesn't run, because the codes there refer to the method with the integer 
		 * argument.  So, this will just print out "Hello".  
		 */
		fobj.normalFunction();
				
	}
}