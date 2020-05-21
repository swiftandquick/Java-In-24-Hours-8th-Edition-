package com.java24hours.hour18.p6;

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
		setSize(400, 125);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/** Default layout, has two rows, each row will display a JPanel. */
		GridLayout layout = new GridLayout(2, 1, 10, 10);
		setLayout(layout);
		
		/** Top row has 2 Buttons.  */
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		topRow.setLayout(topLayout);
		panicButton = new JButton("Panic Button");
		dontPanicButton = new JButton("Don't Panic Button");
		topRow.add(panicButton);
		topRow.add(dontPanicButton);
		add(topRow);
		
		/** Bottom row has 3 Buttons.  It's also a FlowLayout.  */
		JPanel bottomRow = new JPanel();
		FlowLayout bottomLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		bottomRow.setLayout(bottomLayout);
		blameOthersButton = new JButton("Blame Others");
		notifyTheMediaButton = new JButton("Notify the Media");
		saveYourselfButton = new JButton("Save Yourself");
		bottomRow.add(blameOthersButton);
		bottomRow.add(notifyTheMediaButton);
		bottomRow.add(saveYourselfButton);
		add(bottomRow);
		
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
		frame.setLookAndFeel();
		frame.setVisible(true);
	}
	
}
