package com.java24hours.hour19.p8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** This is a old program, but it's relevant in this hour again.  */
@SuppressWarnings("serial")
public class KeyViewer extends JFrame implements KeyListener {

	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel("Press any key in the the text field.  ");
	
	KeyViewer() {
		
		setTitle("Key Viewer");
		setLookAndFeel();
		setSize(350, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		keyText.addKeyListener(this);
		add(keyText, BorderLayout.NORTH);
		add(keyLabel, BorderLayout.CENTER);
		
	}
	
	/** One of the three classes KeyListener generated.  
	 * A method called after a key has been pressed and released.  */
	@Override
	public void keyTyped(KeyEvent key) {
		/** Gets the typed character.  If it's not typed on the text field, 
		 * this method will not be invoked.  */
		char typedKey = key.getKeyChar();
		keyLabel.setText("You pressed " + typedKey + ".  ");
	}

	/** One of the three classes KeyListener generated.  
	 * A method called the moment the key is pressed.  */
	@Override
	public void keyPressed(KeyEvent key) {
		// Invoke method if the key is pressed.  
		// Do nothing, not all three methods need to be used.  
	}

	/** One of the three classes KeyListener generated.  
	 * A method called the moment the key is generated.  */
	@Override
	public void keyReleased(KeyEvent key) {
		// Invoke method if the key is released.  
		// Do nothing, not all three methods need to be used.  
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	
	public static void main(String args[]) {
		KeyViewer frame = new KeyViewer();
		frame.setVisible(true);
	}

}
