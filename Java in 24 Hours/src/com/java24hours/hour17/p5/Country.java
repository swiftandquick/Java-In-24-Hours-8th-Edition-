package com.java24hours.hour17.p5;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Country extends JFrame {

	Country() {
		
		super("Country");
		setSize(500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		/**
		 * Set the width of the text field to 29 characters long, and initial contents
		 * of the text field as "Togolese Republic". Then I reset the text field's
		 * content to a long list of words.  Even that String in the setText method 
		 * is longer than 29 characters, I can still view the full String in text field.  
		 */
		JTextField country = new JTextField("Togolese Republic", 29);
		country.setText("Separate CUstoms Territory of Taiwan, Penghu, Kinmen, and Matsu");
		add(country);
		
		/**
		 * Gets the text from what's currently displayed in the text field. I have no
		 * use of this line of code of now, I can utilize it better later.
		 */
		String countryChoice = country.getText();
		
		/** Sets initial text label equal to contents inside the text field initially.  */
		JLabel countryLabel = new JLabel(countryChoice);
		add(countryLabel);
		
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new Country();
	}
	
}
