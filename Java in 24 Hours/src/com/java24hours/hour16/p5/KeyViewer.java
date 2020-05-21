package com.java24hours.hour16.p5;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class KeyViewer extends JFrame {
	
	// Creates an empty text field with 80 columns.  
	JTextField keyText = new JTextField(80);
	
	// Displays a single line of text.  
	JLabel keyLabel = new JLabel("Press any key in the text field.  ");
	
	KeyViewer() {
		/**
		 * With the implementation of the JFrame class, super(String) allows me to give
		 * the GUI a title.  Which will appear on top left corner.  
		 */
		super("Key Viewer");
		setSize(350, 100); // Size of the pop up.  
		
		/** This is important, otherwise the program will still run even after exiting.  */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		/* The following is an anonymous inner class.  
		 * addKeyListener:  Listener interface for receiving keystrokes.  
		 * KeyAdapter:  Abstract adapter class for receiving keyboard events.  
		 * keyTyped:  When a key is typed, this event occurs when a key press is followed by a key release.  
		 * KeyEvent:  Indicates a keystroke occurs in the component.  
		 * getKeyChar:  A getter that returns the character associated with the key in this event.  
		 * View page 227 for additional explanation.  
		 */
		keyText.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent input) {
				// Simply get the key based on the input.  
				char key = input.getKeyChar();
				// Label changes based on what key you recently pressed.  
				keyLabel.setText("You pressed " + key);
			}
		});
		
		/* Border layout is a layout with 
		 * five regions:  north, south, west, east, center.  
		 */
		BorderLayout bord = new BorderLayout();
		setLayout(bord);

		// The one-line label is set on top of the pop up.  
		add(keyLabel, BorderLayout.NORTH);
		// The  input text is put in the center of the pop up.  
		add(keyText, BorderLayout.CENTER);
		setVisible(true);
	}
	
	// Calls the keyViewer() constructor.  
	public static void main(String[] arguments) {
		new KeyViewer();
	}
}
