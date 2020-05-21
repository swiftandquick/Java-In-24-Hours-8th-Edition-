package com.java24hours.hour23.p2;

class Demo2 {
}

class Demo1 {
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		/** instanceof determines whether if the object is the object 
		 * is the instance of a class.  In first case, it's true.  */
		Demo1 object = new Demo1();
		System.out.println(object instanceof Demo1);
		/** In the second case, it's false, because I didn't initialize 
		 * the object object2 as anything but null.  */
		Demo2 object2 = null;
		System.out.println(object2 instanceof Demo2);
	}
	
}
