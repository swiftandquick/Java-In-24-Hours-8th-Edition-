package com.java24hours.hour19.p4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SpeedCalculator extends JFrame implements ActionListener {

	JLabel title = new JLabel("Speed Calculator");
	JButton calculate = new JButton();
	JLabel distanceL = new JLabel("Distance");
	JTextField distance = new JTextField(10);
	JLabel timeL = new JLabel("Time");
	JTextField time = new JTextField(10);
	JLabel speedL = new JLabel("Speed");
	JTextField speed = new JTextField(10);
	
	SpeedCalculator() {
		
		super("Speed Calculator");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(4, 2, 10, 10);
		setLayout(layout);
		add(title);
		calculate.setText("Get Speed");
		calculate.addActionListener(this);
		add(calculate);
		add(distanceL);
		add(distance);
		add(timeL);
		add(time);
		add(speedL);
		speed.setEditable(false);
		add(speed);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {

		/** Get the source of the event, there is only one source, which is calculate.  */
		Object source = event.getSource();
		
		/** If I click the on the component (Object) with name of calculate, the following will happen.  */
		if (source == calculate) {
			try {
				double distanceValue = Double.parseDouble(distance.getText());
				double timeValue = Double.parseDouble(time.getText());
				if (timeValue == 0) {
					throw new Exception();
				}
				double speedValue = distanceValue / timeValue;
				speed.setText(Double.toString(speedValue));
			}
			catch (Exception e) {
				speed.setText("Invalid");
			}			
		}
		
	}
	
	public static void main(String args[]) {
		
		SpeedCalculator frame = new SpeedCalculator();
		frame.setVisible(true);
		
	}
	
}
