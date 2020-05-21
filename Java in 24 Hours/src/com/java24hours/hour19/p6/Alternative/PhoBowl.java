package com.java24hours.hour19.p6.Alternative;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** This GUI is the same as the original version, exception I use combo box.  */
@SuppressWarnings("serial")
public class PhoBowl extends JFrame implements ActionListener, ItemListener {

	JLabel whatSize = new JLabel();
	/** As oppose to the original frame, I use JComboBox for choice.  */
	JComboBox<String> chooseSize = new JComboBox<String>();
	JButton order = new JButton("Order Now");
	/** Initialized the instance variable which will be used later.  */
	private String bowlSize;
	
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
		
		/** I use FlowLayout because there is only one component added.  */
		JPanel midRow = new JPanel();
		FlowLayout midLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		midRow.setLayout(midLayout);
		/** Add items to the combo box.  */
		chooseSize.addItem("Tiny Size");
		chooseSize.addItem("Small Size");
		chooseSize.addItem("Medium Size");
		chooseSize.addItem("Large Size");
		chooseSize.addItem("Super Size");
		chooseSize.addItem("Impossible Size");
		/** I add the combo box to item listener, it impacts all the contained items as well.  */
		chooseSize.addItemListener(this);
		midRow.add(chooseSize);
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
				
		if (cmd.equalsIgnoreCase("Order Now")) {
			whatSize.setText("You have ordered " + bowlSize + " size bowl of pho.  ");
			/** Disable usage of combo box after ordering.  */
			chooseSize.setEnabled(false);
			order.setText("Order Again"); 
		}
		/** If the current button says Order Again.  I re-enable the check boxes 
		 * and top side label asks if the user wants to order again.  */
		else if (cmd.equalsIgnoreCase("Order Again")) {
			whatSize.setText("What size of pho bowl do you want?  ");
			/** Re-enable usage of combo box after clicking "Order Again" button.  */
			chooseSize.setEnabled(true);
			order.setText("Order Now"); 
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent item) {
		
		/** Check the status of getStateChange().  */
		int status = item.getStateChange();
		if (status == ItemEvent.SELECTED) {
			/** Get the selected item in string format, equate it to instance variable bowlSize.  */
			bowlSize = item.getItem().toString().toLowerCase();
			/** Reset the whatSize label's text display to a question.  */
			whatSize.setText("Do you want to get the " + bowlSize + " bowl of pho?  ");
		}

	}
	
	public static void main(String args[]) {
		PhoBowl frame = new PhoBowl();
		frame.setVisible(true);
	}
	
}
