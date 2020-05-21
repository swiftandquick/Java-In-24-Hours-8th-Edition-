package com.java24hours.hour16.p8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ColorFrame extends JFrame {
	
	ColorFrame() {
		
		// Creates 3 Java buttons.  
		JButton red, green, blue;
		
		// Generates a layout.  
		setSize(322, 122);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		// Write text on the JButtons.  
		red = new JButton("Red");
		add(red);
		green = new JButton("Green");
		add(green);
		blue = new JButton("Blue");
		add(blue);
		
		// Begin anonymous inner class.  
		ActionListener act = new ActionListener() {
			/**
			 * The ActionEvent object has to be named "event" because it's imported from the
			 * package java.awt.event.*, otherwise GUI will have issues.  
			 */
			public void actionPerformed(ActionEvent event) {
				/* Clicking on the button will change 
				 * the background color of the corresponding class.  
				 */
				if (event.getSource() == red) {
					getContentPane().setBackground(Color.RED);
				}
				if (event.getSource() == green) {
					getContentPane().setBackground(Color.GREEN);
				}
				if (event.getSource() == blue) {
					getContentPane().setBackground(Color.BLUE);
				}
			}
		};
		// End anonymous inner class.  
		red.addActionListener(act);  
		green.addActionListener(act);  
		blue.addActionListener(act); 
		
		// Set it visible to your screen.  
		setVisible(true);
	}
	
	// The main method calls the ColorFrame() constructor.  
	public static void main(String[] arguments) {
		new ColorFrame();
	}
	
}