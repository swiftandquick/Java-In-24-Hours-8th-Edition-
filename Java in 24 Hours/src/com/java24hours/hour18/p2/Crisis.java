package com.java24hours.hour18.p2;

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
		 * Border layout can fully fill up the frame with 5 components, with each
		 * component on different direction: north, south, east, west, and center.
		 */
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameOthersButton = new JButton("Blame Others");
		notifyTheMediaButton = new JButton("Notify the Media");
		saveYourselfButton = new JButton("Save Yourself");
		
		/** Sort the position of each button while adding.  */
		add(panicButton, BorderLayout.NORTH);
		add(dontPanicButton, BorderLayout.SOUTH);
		add(blameOthersButton, BorderLayout.EAST);
		add(notifyTheMediaButton, BorderLayout.WEST);
		add(saveYourselfButton, BorderLayout.CENTER);
		
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
		Crisis frame = new Crisis();
		frame.setVisible(true);
	}
	
}
