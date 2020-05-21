package com.java24hours.hour19.p7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ComboBoxEvent extends JFrame implements ItemListener {

	JComboBox<String> course = new JComboBox<String>();
	JLabel choice = new JLabel();
	
	ComboBoxEvent() {
		super("Combo Box Event");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);
		
		course.addItem("English");
		course.addItem("Math");
		course.addItem("Social Studies");
		course.addItem("Science");
		/** I can addItemListener to add events based on choice.  */
		course.addItemListener(this);
		add(course);
		
		choice.setText("Select a class.  ");
		add(choice);
		
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent item) {
		int status = item.getStateChange();
		if (status == ItemEvent.SELECTED) {
			// Object which = item.getItem();
			// String answer = which.toString();
			/** Only these two lines are needed. Because usually this method is invoked 
			 * when an item is already selected, so I don't have to check it, but I can 
			 * still check it just to be safe.  TL;DR:  I don't need conditional check.  */
			String answer = item.getItem().toString();
			choice.setText(answer);
		}
	}
	
	public static void main(String args[]) {
		new ComboBoxEvent();
	}
	
}
