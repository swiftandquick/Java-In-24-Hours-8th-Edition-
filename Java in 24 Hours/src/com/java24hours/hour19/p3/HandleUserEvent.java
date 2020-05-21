package com.java24hours.hour19.p3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** This frame has no purpose, it only shows what getSource() can do.  */
@SuppressWarnings("serial")
public class HandleUserEvent extends JFrame implements ActionListener {

	JButton start = new JButton("Start");
	JTextField speed = new JTextField("0", 5);
	JTextField viscoity = new JTextField("0", 5);
	
	HandleUserEvent() {
		
		super("Handle User Event");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 20, 10);
		setLayout(layout);
		
		/** Add the three components to action listener*/
		start.addActionListener(this);
		speed.addActionListener(this);
		viscoity.addActionListener(this);
		add(start);
		add(speed);
		add(viscoity);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		/** Create an Object object named source, then get the source (Object) rather
		 * than the command (String). */
		Object source = event.getSource();
		/** If I entered anything in the first text field, then hit the enter key, 
		 * the text field will be set to 5 no matter what.  */
		if (source == speed) {
			speed.setText("5");
		}
		/** Same as above, but no matter what I enter, it will display 10.  */
		else if (source == viscoity) {
			viscoity.setText("10");
		}
		/** When I click on the start button, the text will change from "Start" 
		 * to "Stop" and it will not change back.  */
		else {
			start.setText("Stop");
		}
	}
	
	public static void main(String args[]) {
		HandleUserEvent frame = new HandleUserEvent();
		frame.setVisible(true);
	}
	
}
