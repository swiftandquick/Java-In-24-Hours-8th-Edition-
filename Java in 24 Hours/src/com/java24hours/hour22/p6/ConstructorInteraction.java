package com.java24hours.hour22.p6;

import javax.swing.*;

@SuppressWarnings("serial")
public class ConstructorInteraction extends JFrame {
	
	int instanceNum;
	
	ConstructorInteraction(int rNum) {
		instanceNum = rNum;
	}
	
	public void printNum () {
		System.out.println(instanceNum);
	}
	
	public static void main(String args[]) {
		int num = 5;
		ConstructorInteraction object = new ConstructorInteraction(num);
		object.printNum();
	}
	
}
