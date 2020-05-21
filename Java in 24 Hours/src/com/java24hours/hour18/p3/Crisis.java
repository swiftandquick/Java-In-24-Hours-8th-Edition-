package com.java24hours.hour18.p3;

import javax.swing.*;

@SuppressWarnings("serial")
public class Crisis extends JFrame {

	JButton panicButton;
	JButton dontPanicButton;
	JButton blameOthersButton;
	JButton notifyTheMediaButton;
	JButton saveYourselfButton; 
	
	Crisis() {
		
		setTitle("Crisis");
		setSize(250, 325);
		setLookAndFeel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameOthersButton = new JButton("Blame Others");
		notifyTheMediaButton = new JButton("Notify the Media");
		saveYourselfButton = new JButton("Save Yourself");
		
		/** I didn't set the default layout, so it's FlowLayout by default.  */
		
		/**
		 * Set the JPanel first, then use it for box layout. The JPanel container will
		 * contain the BoxLayout container and 5 buttons.
		 */
		JPanel panel = new JPanel();
		/**
		 * Here, I set the layout maintain the buttons in vertical order. If I want to
		 * sort the buttons horizontally, I can change Y_AXIS to X_AXIS.
		 */
		BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		// BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		panel.add(panicButton);
		panel.add(dontPanicButton);
		panel.add(blameOthersButton);
		panel.add(notifyTheMediaButton);
		panel.add(saveYourselfButton);
		add(panel);
		
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
