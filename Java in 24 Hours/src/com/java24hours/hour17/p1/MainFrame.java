package com.java24hours.hour17.p1;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
	/** Constructor, I put most GUI related methods in there.  */
	MainFrame() {
		
		/** Sets the name.  */
		setTitle("Main Frame");
		/** I can also call the constructor in superclass (JFrame) to set the name */
		// super("Main Frame");
		
		/** Throws a try-catch block because I am not sure if UIManager can find the import.  */
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			/** Do nothing here because I don't want to interrupt the program.  */
		}
		
		/** Here, I use the method pack() to set the size just enough to hold all components.  */
		// pack();		
		/** I can set the size with fixed size also, with setSize(width, height) method.  */
		setSize(350, 125);
		
		/**
		 * By default, I should set default close operation to exit on close, because we
		 * don't want the program to keep running when the GUI window is close.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		/** Calls the empty constructor.  */
		new MainFrame();
	}
	
}
