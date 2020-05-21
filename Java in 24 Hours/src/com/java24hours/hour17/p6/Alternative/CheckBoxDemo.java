package com.java24hours.hour17.p6.Alternative;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CheckBoxDemo extends JFrame {

	CheckBoxDemo() {
		setTitle("Check Box Demo");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		/**
		 * Adds a check box with the name Jumbo Size next to it, set the object to true
		 * means that the check box is initially checked.
		 */
		JCheckBox jumboSize = new JCheckBox("Jumbo Size");
		add(jumboSize);
		
		JCheckBox frogLegGrande = new JCheckBox("Frog Leg Grande");
		add(frogLegGrande);
		
		/** Here, the box isn't checked because the boolean attribute is false.  */
		JCheckBox fishTacoPlatter = new JCheckBox("Fish Taco Platter");
		add(fishTacoPlatter);
		
		/** Not setting the object's boolean attribute to true means it's false by default.  */
		JCheckBox emuNuggets = new JCheckBox("Emu Nuggets");
		add(emuNuggets);
		
		/**
		 * I can also create a ButtonGroup object to gather them as group of check
		 * boxes. Inside the ButtonGroup, only 1 button can be clicked at the time.
		 */
		ButtonGroup meals = new ButtonGroup();
		meals.add(jumboSize);
		meals.add(frogLegGrande);
		meals.add(fishTacoPlatter);
		meals.add(emuNuggets);
		
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new CheckBoxDemo();
	}
	
}