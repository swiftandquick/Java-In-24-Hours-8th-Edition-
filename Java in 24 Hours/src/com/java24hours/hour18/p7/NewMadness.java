package com.java24hours.hour18.p7;

import java.awt.*;
import javax.swing.*;

/**
 * This is only a GUI layout, it has no function. It is similar to LottoMadness
 * from hour18.p5, but a bit different. I will note the different but get rid of
 * rest of the notes from hour18.p5.
 */
@SuppressWarnings("serial")
public class NewMadness extends JFrame {

	JPanel row1 = new JPanel();
	/** I use combo box rather than check boxes.  */
	JComboBox<String> option = new JComboBox<String>();
	// ButtonGroup option = new ButtonGroup();
	// JCheckBox quickpick = new JCheckBox("Quick Pick", false);
	// JCheckBox personal = new JCheckBox("Personal", true);
	
	JPanel row2 = new JPanel();
	JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
	JTextField[] numbers = new JTextField[6];
	JLabel winnersLabel = new JLabel("Winners:  ", JLabel.RIGHT);
	JTextField[] winners = new JTextField[6];
	
	JPanel row3 = new JPanel();
	/**
	 * Instead of 3 separate buttons, I use 3 separate checkboxes, but I can only
	 * choose 1 because I group them together with ButtonGroup.
	 */
	ButtonGroup choice = new ButtonGroup();
	JCheckBox stop = new JCheckBox("Stop");
	JCheckBox play = new JCheckBox("Play");
	JCheckBox reset = new JCheckBox("Reset");
	// JButton stop = new JButton("Stop");
	// JButton play = new JButton("Play");
	// JButton reset = new JButton("Reset");
	
	JPanel row4 = new JPanel();
	JLabel got3Label = new JLabel("3 of 6:  ", JLabel.RIGHT);
	JTextField got3 = new JTextField("0");
	JLabel got4Label = new JLabel("4 of 6:  ", JLabel.RIGHT);
	JTextField got4 = new JTextField("0");
	JLabel got5Label = new JLabel("5 of 6:  ", JLabel.RIGHT);
	JTextField got5 = new JTextField("0");
	JLabel got6Label = new JLabel("6 of 6:  ", JLabel.RIGHT);
	JTextField got6 = new JTextField("0", 10);
	JLabel drawingsLabel = new JLabel("Drawings:  ", JLabel.RIGHT);
	JTextField drawings = new JTextField("0");
	JLabel yearsLabel = new JLabel("Years:  ", JLabel.RIGHT);
	JTextField years = new JTextField();
	
	NewMadness() {
				
		/** Title name changes.  */
		setTitle("New Madness");
		setSize(550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(5, 1, 10, 10);
		setLayout(layout);
	
		FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row1.setLayout(layout1);
		option.addItem("Quick Pick");
		option.addItem("Personal");
		row1.add(option);
		/* row1.add(quickpick);
		row1.add(personal);
		option.add(quickpick);
		option.add(personal); */
		add(row1);
	
		GridLayout layout2 = new GridLayout(2, 7, 10, 10);
		row2.setLayout(layout2);
		row2.add(numbersLabel);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JTextField();
			row2.add(numbers[i]);
		}
		row2.add(winnersLabel);
		for (int i = 0; i < winners.length; i++) {
			winners[i] = new JTextField();
			winners[i].setEditable(false);
			row2.add(winners[i]);
		}
		add(row2);
		
		FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row3.setLayout(layout3);
		/** Add the three check boxes to ButtonGroup so I can only choose 1.  */
		choice.add(stop);
		choice.add(play);
		choice.add(reset);
		/** I will also add the check boxes to the JPanel of course.  */
		row3.add(stop);
		row3.add(play);
		row3.add(reset);
		add(row3);
		
		GridLayout layout4 = new GridLayout(2, 6, 10, 10);
		row4.setLayout(layout4);
		row4.add(got3Label);
		row4.add(got3);
		row4.add(got4Label);
		row4.add(got4);
		row4.add(got5Label);
		row4.add(got5);
		row4.add(got6Label);
		row4.add(got6);
		row4.add(drawingsLabel);
		row4.add(drawings);
		row4.add(yearsLabel);
		row4.add(years);
		add(row4);
		
	}
	
	/**
	 * Notice how the method is static, because I am invoking the method from
	 * another static method (main method) without using named objects.
	 */
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	
	/** Main method.  */
	public static void main(String args[]) {

		NewMadness frame = new NewMadness();

		/** I use class name rather than object name to invoke setLookAndFeel.  */
		NewMadness.setLookAndFeel();
		frame.setVisible(true);
		
	}
		
}