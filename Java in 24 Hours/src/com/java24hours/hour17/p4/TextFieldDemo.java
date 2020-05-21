package com.java24hours.hour17.p4;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TextFieldDemo extends JFrame {

	TextFieldDemo() {
		
		super("Text Field Demo");
		setLookAndFeel();
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/**
		 * Border layout is like flow layout, except there is no space in-between
		 * components and center alignment. I use border layout here because flow layout
		 * doesn't allow my JLabel component to align left as flow layout sets
		 * everything center-aligned by default.
		 */
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		/** Create a text label.  Align it to left side.  */
		JLabel pageLabel = new JLabel("Web page address:  ", JLabel.LEFT);
		add(pageLabel);
		
		/**
		 * Create a text field for people to enter a website, it's not working, but this
		 * is just an example. The textField is 20 columns.
		 */
		// JTextField pageAddress = new JTextField(20);
		// add(pageAddress);
		
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
