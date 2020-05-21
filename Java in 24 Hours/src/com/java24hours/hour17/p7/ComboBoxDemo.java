package com.java24hours.hour17.p7;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ComboBoxDemo extends JFrame {

	ComboBoxDemo () {

		setTitle("Combo Box Demo");
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		/**
		 * Creates a combo box, make sure I give it a non-primitive type because it's
		 * stored as a list of objects. Here, I set the object type as String. Then, I
		 * add the String elements to the combo box.
		 */
		JComboBox<String> profession = new JComboBox<String>();
		profession.addItem("Butcher");
		profession.addItem("Baker");
		profession.addItem("Candlestick Maker");
		profession.addItem("Fletcher");
		profession.addItem("Technical Writer");
		
		/**
		 * Allows me to edit the options while the GUI is on. It's not a good idea to do
		 * that realistically, but I am just doing it for testing.
		 */
		profession.setEditable(true);
		
		add(profession);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new ComboBoxDemo();
	}
	
}
