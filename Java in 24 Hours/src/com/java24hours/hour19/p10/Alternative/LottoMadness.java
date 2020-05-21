package com.java24hours.hour19.p10.Alternative;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class LottoMadness extends JFrame {

	/** Creates an instance variable, which is also an LottoEvent object 
	 * named lotto.  */
	LottoEvent lotto = new LottoEvent(this);
	
	/** Set up row 1.  */
	JPanel row1 = new JPanel();
	ButtonGroup option = new ButtonGroup();
	JCheckBox quickpick = new JCheckBox("Quick Pick", false);
	JCheckBox personal = new JCheckBox("Personal", true);
	/** These components can display and determine the speed of drawing.  */
	JLabel speedLabel = new JLabel("    Drawing Speed", JLabel.RIGHT);
	JTextField speed = new JTextField("100", 6);
	JLabel msLabel = new JLabel("Milliseconds / Draw ", JLabel.LEFT);
	
	/** Set up row 2.  It will be displayed as two rows.  */
	JPanel row2 = new JPanel();
	JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
	JTextField[] numbers = new JTextField[6];
	JLabel winnersLabel = new JLabel("Winners:  ", JLabel.RIGHT);
	JTextField[] winners = new JTextField[6];
	
	/** Set up for row 3.  */
	JPanel row3 = new JPanel();
	JButton stop = new JButton("Stop");
	JButton play = new JButton("Play");
	JButton reset = new JButton("Reset");
	
	/** Set up row 4.  It will be displayed as two rows.  */
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

	
	LottoMadness() {
				
		super("Lotto Madness");
		setSize(550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(5, 1, 10, 10);
		setLayout(layout);
	
		quickpick.addItemListener(lotto);
		personal.addItemListener(lotto);
		
		stop.addActionListener(lotto);
		play.addActionListener(lotto);
		reset.addActionListener(lotto);
		
		FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row1.setLayout(layout1);
		row1.add(quickpick);
		row1.add(personal);
		option.add(quickpick);
		option.add(personal);
		/** Add the new components to row1.  */
		row1.add(speedLabel);
		row1.add(speed);
		row1.add(msLabel);
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
	
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	
	
	public static void main(String args[]) {
		LottoMadness frame = new LottoMadness();
		frame.setLookAndFeel();
		frame.setVisible(true);	
	}
		
}
