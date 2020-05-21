package com.java24hours.hour19.p5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CheckBoxEvent extends JFrame implements ItemListener {

	JCheckBox click = new JCheckBox("Click Me"); 
	JLabel label = new JLabel();
	
	CheckBoxEvent() {
		
		super("Check Box");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);
		
		click.addItemListener(this);
		add(click);
		label.setText("False");
		add(label);
		
		setVisible(true);
		
	}
	
	@Override
	/** item is actually represent by an object named ItemEvent, it's not an actual item as in a component.  */
	public void itemStateChanged(ItemEvent item) {
		
		if (click.isSelected()) {
			label.setText("True");
		}
		else {
			label.setText("False");
		}
		
	}
	
	public static void main(String args[]) {
		new CheckBoxEvent();
	}

}
