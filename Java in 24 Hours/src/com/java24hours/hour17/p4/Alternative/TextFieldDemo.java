package com.java24hours.hour17.p4.Alternative;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TextFieldDemo extends JFrame {

	TextFieldDemo() {
		
		super("Text Field Demo");
		setLookAndFeel();
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		/** Create a text label.  No alignment this time because flow layout sets everything align to center.  */
		JLabel pageLabel = new JLabel("Web page address:  ");
		add(pageLabel);
		
		/**
		 * Create a text field for people to enter a website, it's not working, but this
		 * is just an example. The textField has the size of 20 characters (columns).
		 */
		JTextField pageAddress = new JTextField("Enter website here.  ", 20);
		add(pageAddress);
		
		setVisible(true);
		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	public static void main(String args[]) {
		new TextFieldDemo();
	}
	
}