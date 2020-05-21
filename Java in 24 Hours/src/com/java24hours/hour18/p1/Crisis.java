package com.java24hours.hour18.p1;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Crisis extends JFrame {

	JButton panicButton;
	JButton dontPanicButton;
	JButton blameOthersButton;
	JButton notifyTheMediaButton;
	JButton saveYourselfButton;
	
	Crisis() {
		setTitle("Crisis");
		setSize(348, 128);
		setLookAndFeel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/**
		 * FlowLayout uses its container’s dimension to place components. Components may
		 * be placed differently when the frame’s windows is resized.  Try to stretch the 
		 * frame's window, and all the sudden 5 buttons are on the same line.  
		 */
		/*
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		*/
		
		/**
		 * Since FlowLayout isn't reliable on its own, I am going to use GridLayout.
		 * GridLayout orders components by row and column. Below, I ordered components
		 * into 2 rows and 3 columns.
		 */
		GridLayout layout = new GridLayout(2, 3);
		setLayout(layout);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameOthersButton = new JButton("Blame Others");
		notifyTheMediaButton = new JButton("Notify the media");
		saveYourselfButton = new JButton("Save Yourself");
		
		add(panicButton);
		add(dontPanicButton);
		add(blameOthersButton);
		add(notifyTheMediaButton);
		add(saveYourselfButton);
		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	
	public static void main(String args[]) {
	
		/** Create a named object and set it visible.  */
		Crisis frame = new Crisis();
		frame.setVisible(true);
	
	}
	
}
