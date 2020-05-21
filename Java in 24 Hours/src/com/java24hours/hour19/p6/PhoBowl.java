package com.java24hours.hour19.p6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** I need to implement the ItemListener interface to use addItemListener() method.  */
@SuppressWarnings("serial")
public class PhoBowl extends JFrame implements ActionListener, ItemListener {

	JLabel whatSize = new JLabel();
	ButtonGroup chooseSize = new ButtonGroup();
	JCheckBox tinySize = new JCheckBox("Tiny Size");
	JCheckBox smallSize = new JCheckBox("Small Size");
	JCheckBox mediumSize = new JCheckBox("Medium Size");
	JCheckBox largeSize = new JCheckBox("Large Size");
	JCheckBox superSize = new JCheckBox("Super Size");
	JCheckBox impossibleSize = new JCheckBox("Impossible Size");
	JButton order = new JButton("Order Now");
	
	PhoBowl() {
		setTitle("Pho Bowl");
		setSize(350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(3, 1, 10, 10);
		setLayout(layout);
		
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		topRow.setLayout(topLayout);
		whatSize.setText("What size of pho bowl do you want?  ");
		topRow.add(whatSize);
		add(topRow);
		
		JPanel midRow = new JPanel();
		GridLayout midLayout = new GridLayout(3, 2, 10, 10);
		midRow.setLayout(midLayout);
		midRow.add(tinySize);
		midRow.add(smallSize);
		midRow.add(mediumSize);
		midRow.add(largeSize);
		midRow.add(superSize);
		midRow.add(impossibleSize);
		/** Add the buttons to button group, only one can be selected.  */
		chooseSize.add(tinySize);
		chooseSize.add(smallSize);
		chooseSize.add(mediumSize);
		chooseSize.add(largeSize);
		chooseSize.add(superSize);
		chooseSize.add(impossibleSize);
		/** Add the choices to item listener.  */
		tinySize.addItemListener(this);
		smallSize.addItemListener(this);
		mediumSize.addItemListener(this);
		largeSize.addItemListener(this);
		superSize.addItemListener(this);
		impossibleSize.addItemListener(this);
		add(midRow);
		
		JPanel bottomRow = new JPanel();
		FlowLayout bottomLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		bottomRow.setLayout(bottomLayout);
		order.addActionListener(this);
		bottomRow.add(order);
		add(bottomRow);
		
	}
	
	@Override
	/** There should be a way to check if an item is selected and get the String
	 * based on item selected, what I did shouldn't be the optimal way.  */
	public void actionPerformed(ActionEvent event) {
		
		/** It should get the button's command in String.  */
		String cmd = event.getActionCommand();
		
		String[] words = whatSize.getText().split(" ");
		/** Bowl size is represented by the 6th word of the sentence, which is index 5.  */
		String size = words[5];
		
		if (cmd.equalsIgnoreCase("Order Now")) {
			whatSize.setText("You have ordered " + size + " size bowl of pho.  ");
			/** Disable user from checking all bowls.  */
			tinySize.setEnabled(false);
			smallSize.setEnabled(false);
			mediumSize.setEnabled(false);
			largeSize.setEnabled(false);
			superSize.setEnabled(false);
			impossibleSize.setEnabled(false);
			/** Change text command of the button.  */
			order.setText("Order Again"); 
		}
		/** If the current button says Order Again.  I re-enable the check boxes 
		 * and top side label asks if the user wants to order again.  */
		else if (cmd.equalsIgnoreCase("Order Again")) {
			whatSize.setText("What size of pho bowl do you want?  ");
			tinySize.setEnabled(true);
			smallSize.setEnabled(true);
			mediumSize.setEnabled(true);
			largeSize.setEnabled(true);
			superSize.setEnabled(true);
			impossibleSize.setEnabled(true);
			order.setText("Order Now"); 
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent item) {
		
		/** Check if each option is selected, I supposed there is a better way.  */
		if (tinySize.isSelected()) {
			whatSize.setText("Are you going to get tiny size bowl of pho?  ");
		}
		else if (smallSize.isSelected()) {
			whatSize.setText("Are you going to get small size bowl of pho?  ");
		}
		else if (mediumSize.isSelected()) {
			whatSize.setText("Are you going to get medium size bowl of pho?  ");
		}
		else if (largeSize.isSelected()) {
			whatSize.setText("Are you going to get large size bowl of pho?  ");
		}
		else if (superSize.isSelected()) {
			whatSize.setText("Are you going to get super size bowl of pho?  ");
		}
		else { // If possible size is selected.  
			whatSize.setText("Are you going to get impossible size bowl of pho?  ");
		} 

	}
	
	public static void main(String args[]) {
		PhoBowl frame = new PhoBowl();
		frame.setVisible(true);
	}
	
}
