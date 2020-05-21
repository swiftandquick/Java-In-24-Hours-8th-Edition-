package com.java24hours.hour17.p11;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class FreeSpaceFrame extends JFrame {

	FreeSpaceFrame() {
		
		/** Set the title, outlook, size, and default close operation.  */
		setTitle("Disk Free Space");
		setLookAndFeel();
		setSize(500, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/** Set the layout to flow layout.  */
		FlowLayout layout = new FlowLayout();
		setLayout(layout);

		/** Add the FreeSpacePanel object freePanel, which contains two JLabel components.  */
		FreeSpacePanel freePanel = new FreeSpacePanel();
		add(freePanel);

		/** Set the GUI visible.  */
		setVisible(true);
	}
	
	/** Try to get a different outlook for the frame.  */
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e){
			/** Do nothing because I don't want to interrupt the GUI.  */
		}
	}
	
	/** Main method.  */
	public static void main(String[] args) {
		/** Invokes the constructor.  */
		new FreeSpaceFrame();
	}
	
}
