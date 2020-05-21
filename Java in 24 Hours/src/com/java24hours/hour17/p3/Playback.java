package com.java24hours.hour17.p3;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Playback extends JFrame {

	Playback() {
		
		super("Playback"); // title

		setLookAndFeel(); // outlook of the frame
		
		setSize(450, 200); // size
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program terminates on close.  
		
		// Sets layout.  
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		// Adds three buttons.  
		JButton okButton = new JButton("OK");
		add(okButton);
		
		JButton playButton = new JButton("Play");
		add(playButton);
		
		JButton stopButton = new JButton("Stop");
		add(stopButton);
		
		setVisible(true); // Set frame visible.  
		
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
		new Playback();
	}
	
}
