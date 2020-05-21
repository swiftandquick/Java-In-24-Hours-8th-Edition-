package com.java24hours.hour19.p1;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; // For adding actions on components.  

@SuppressWarnings("serial")
public class Torpedo extends JFrame implements ActionListener {

	JButton fireTorpedos = new JButton("Fire Torpedos");
	JTextField display = new JTextField(20);
	
	Torpedo() {
		
		setTitle("Torpedo");
		setSize(300, 125);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);
		
		add(fireTorpedos);
		/** Codes related to the effect of clicking the button will be in actionPerformed method.  */
		fireTorpedos.addActionListener(this);
		
		/** The text field will display "Hit me!  " by default.  */
		display.setEditable(false);
		display.setText("Hit me!  ");
		add(display);
		
		setVisible(true);
		
	}
	
	/**
	 * It's better to use Lambda Expression than adding a method. There will be more
	 * than one effect added to the components because there will be different
	 * interactive components on a frame.
	 */
	public void actionPerformed(ActionEvent event) {
		/** Reset the text field to what's inside the parenthesis after the button click.  */
		display.setText("Ouch, that hurts!  ");
	}
	
	public static void main(String args[]) {
		new Torpedo();
	}
	
}
