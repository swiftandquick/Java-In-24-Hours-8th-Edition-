package com.java24hours.hour17.p10;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PanelsDemo extends JFrame {

	PanelsDemo() {
		
		setTitle("Panels Demo");
		setSize(600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/**
		 * GridLayout has two rows and one column. The GridLayout will use top row to
		 * store topRow JPanel, and bottom row to store bottomRow JPanel.
		 */
		GridLayout layout = new GridLayout(2, 1);
		setLayout(layout);
		
		/**
		 * JPanel objects is to subdivide a display area into different groups of
		 * components. I am not sure what it does it, here I wrap it around a layout.
		 */
		JPanel topRow = new JPanel();
		FlowLayout topLayout = new FlowLayout(FlowLayout.LEFT);
		topRow.setLayout(topLayout);
		JButton topButton = new JButton("Yes");
		topRow.add(topButton);
		/** Adds topRow JPanel to GridLayout.  */
		add(topRow);
		
		/**
		 * The bottomRow is set to be a BorderLayout, with five JLabel components
		 * station at each "side" of the BoxLayout.  Display of the bottomRow 
		 * in the frame may look weird because GridLayout aligns left by default.  
		 */
		JPanel bottomRow = new JPanel();
		BorderLayout bottomLayout = new BorderLayout();
		bottomRow.setLayout(bottomLayout);
		JLabel north = new JLabel("North");
		JLabel west = new JLabel("West");
		JLabel south = new JLabel("South");
		JLabel east = new JLabel("East");
		JLabel center = new JLabel("Center");
		bottomRow.add(north, BorderLayout.NORTH);
		bottomRow.add(west, BorderLayout.WEST);
		bottomRow.add(south, BorderLayout.SOUTH);
		bottomRow.add(east, BorderLayout.EAST);
		bottomRow.add(center, BorderLayout.CENTER);
		add(bottomRow);
		
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new PanelsDemo();
	}
	
}
