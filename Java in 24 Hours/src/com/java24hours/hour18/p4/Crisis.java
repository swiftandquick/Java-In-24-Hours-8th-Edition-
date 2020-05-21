package com.java24hours.hour18.p4;

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
		setSize(500, 250);
		setLookAndFeel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/**
		 * Sets the background color green so it gives me the idea of how much space is
		 * cut from the container due to Insets.
		 */
		setBackground(Color.GREEN);
		
		FlowLayout layout = new FlowLayout(); 
		setLayout(layout);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameOthersButton = new JButton("Blame Others");
		notifyTheMediaButton = new JButton("Notify the Media");
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
	
	@Override
	/**
	 * I am overriding the getInsets() from Insets class. Insets determines how much
	 * space to leave at top, left, bottom, and right, or how big the border is.
	 * (50, 15, 10, 15) means 50 pixels are space are cut from top side, 15 pixels
	 * from left, 10 pixels from bottom, and 15 pixels from right.
	 */
	public Insets getInsets() {
		/** This is default Insets in the Insets class, I can reset Insets to suit my need.  */
		// return new Insets(50, 15, 10, 15);
		/** With the new Insets, some of my buttons are no longer fully visible.  */
		// return new Insets(10, 6, 10, 3);
		/** Now, I can see all buttons and the green border (in actuality, background) from all sides.  */
		return new Insets(75, 75, 75, 75);
	}
	
	public static void main(String args[]) {
		Crisis frame = new Crisis();
		frame.setVisible(true);
	}
	
}
