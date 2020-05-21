package com.java24hours.hour19.p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Torpedo extends JFrame implements ActionListener {

	JButton fireTorpedos = new JButton("Fire Torpedos");
	JButton launchNuke = new JButton("Launch Nuke");
	JButton healWounds = new JButton("Heal Wounds");
	JTextField display = new JTextField();
	JTextField hp = new JTextField();
	
	Torpedo() {
		
		setTitle("Torpedo");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(2, 1, 10, 10);
		setLayout(layout);
		
		/** Creates top row.  */
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
		topRow.setLayout(topLayout);
		fireTorpedos.addActionListener(this);
		launchNuke.addActionListener(this);
		healWounds.addActionListener(this);
		/** It's initially false because HP is initially full (10).  */
		healWounds.setEnabled(false);
		topRow.add(fireTorpedos);
		topRow.add(launchNuke);
		topRow.add(healWounds);
		add(topRow);
		
		/** Creates bottom row.  */
		JPanel bottomRow = new JPanel();
		GridLayout bottomLayout = new GridLayout(1, 2, 25, 10);
		bottomRow.setLayout(bottomLayout);
		display.setText("Hit me!  ");
		hp.setText("HP:  10");
		/** Set text fields to non-editable.  */
		display.setEditable(false);
		hp.setEditable(false);
		bottomRow.add(display);
		bottomRow.add(hp);
		add(bottomRow);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		/**
		 * getActionCommand gets the String that is associated with the component, the
		 * String is usually place inside the parenthesis when we created the
		 * components. For example, the string command for fireTorpedos is "Fire
		 * Torpedos".  I can use this to determine the outcome of the frame.  
		 */
		String cmd = event.getActionCommand();
		
		/** Gets text from the hp JTextField.  */
		String split[] = hp.getText().split(":  ");
		/** Convert the second index (index 1) from String to int, it should represent current HP.  */
		int currentHP = Integer.parseInt(split[1]);
		
		
		if (currentHP > 0) {
			if (cmd == "Fire Torpedos") {
				/** Lose 1 HP against torpedos.  */
				currentHP--;
				display.setText("Ouch, that hurted.  ");
				hp.setText("HP:  " + currentHP);
			}
			else if (cmd == "Launch Nuke") {
				/** Lose 5 HP against nukes.  */
				currentHP = currentHP - 5;
				display.setText("That hurted a lot!  ");
				/** HP can't be negative.  */
				if (currentHP < 0) {
					currentHP = 0;
				}
				hp.setText("HP:  " + currentHP);
			}
		}
		else {
			display.setText("I am dead, revive me!  ");
			/** If HP < 0, I disable the buttons that can lower HP.  So, now I can only heal wounds.  */
			fireTorpedos.setEnabled(false);
			launchNuke.setEnabled(false);
		}
		
		if (currentHP == 10) {
			healWounds.setEnabled(false);
		}
		else {
			healWounds.setEnabled(true);
			if (cmd == "Heal Wounds") {
				/** Re-enable the offensive buttons and reset HP to 10.  */
				fireTorpedos.setEnabled(true);
				launchNuke.setEnabled(true);
				currentHP = 10;
				display.setText("Thanks for healing me.  ");
				hp.setText("HP:  " + currentHP);
			}
		}
		
	}
	
	public static void main(String args[]) {
		Torpedo frame = new Torpedo();
		frame.setVisible(true);
	}
	
}
