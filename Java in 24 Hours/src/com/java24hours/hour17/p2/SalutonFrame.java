package com.java24hours.hour17.p2;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SalutonFrame extends JFrame {

	SalutonFrame() {
		super("Saluton Frame");
		
		/**
		 * Instead of setting look and feel in the constructor, I created a separate
		 * private method for it. Both works in the same way.
		 */
		setLookAndFeel();
		
		/**
		 * Create a default FlowLayout object called layout. The FlowLayout grants
		 * center-alignment and 5 units space in-between for components.
		 */
		FlowLayout layout = new FlowLayout();

		/** Set the layout.  */
		setLayout(layout);
		
		/** Create a button via JButton, "OK" is the content inside button.  */
		JButton okButton = new JButton("OK");
		
		/** Add the button in the frame.  */
		add(okButton);
		
		/** Adds a text label.  */
		JLabel label = new JLabel("Saluton Mondo!");
		add(label);
		
		setSize(450, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			/** Do nothing because I don't want to interrupt the frame's running process.  */
		}
	}
	
	public static void main(String[] args) {
		/**
		 * Here, I created a named object rather than just using a newly created object
		 * to invoke the constructor's methods.
		 */
		// SalutonFrame frame = new SalutonFrame();
		
		/**
		 * Because I never use the object frame to invoke again, I am just going to
		 * create a nameless object for constructor invoking purpose.
		 */
		new SalutonFrame();
	}
	
}
