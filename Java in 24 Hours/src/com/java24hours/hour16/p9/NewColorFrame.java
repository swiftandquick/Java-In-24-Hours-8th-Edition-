package com.java24hours.hour16.p9;

// Same as ColorFrame.java, but we use Lambda Expression and add the yellow color.  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class NewColorFrame extends JFrame {

	JButton red, green, blue, yellow; 
	
	public NewColorFrame() {
		// Not sure what this does.  
		super("NewColorFrame");
		setSize(322, 122);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		red = new JButton("Red");
		add(red);
		green = new JButton("Green");
		add(green);
		blue = new JButton("Blue");
		add(blue);
		yellow = new JButton("Yellow");
		add(yellow);
		
		/* Begin Lambda expression.  
		 * A simplified way to write the codes with same function.  
		 */
		ActionListener act = (event) -> {
			if (event.getSource() == red) {
				getContentPane().setBackground(Color.RED);
			}
			if (event.getSource() == green) {
				getContentPane().setBackground(Color.GREEN);
			}
			if (event.getSource() == blue) {
				getContentPane().setBackground(Color.BLUE);
			}
			if (event.getSource() == yellow) {
				getContentPane().setBackground(Color.YELLOW);
			}
		};
		// End Lambda expression.  
		
		red.addActionListener(act);
		green.addActionListener(act);
		blue.addActionListener(act);
		yellow.addActionListener(act);
		setVisible(true);
		
	}
	
	public static void main(String arguments[]) {
		new NewColorFrame();
	}
	
}