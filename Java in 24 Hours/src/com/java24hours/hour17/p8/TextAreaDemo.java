package com.java24hours.hour17.p8;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TextAreaDemo extends JFrame {

	TextAreaDemo() {
		setTitle("Text Area Demo");
		setSize(500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		/** Creates a text area, give it initial text display, height, and width.  This 
		 * text area is 8 lines tall and 40 characters long, it will initially displays 
		 * a long text in form of String. */
		JTextArea comments = new JTextArea("I should have been a pair of ragged claws.  Hi!  "
				+ "The rain in Spain falls mainly on the plain.  ", 8, 40);
		/**
		 * If a line is too long, I can use setLineWrap(true) method to set it that we
		 * can limit the amount of characters per line.  Notice how the text in the above 
		 * argument is too long, so the remaining text goes to the second line.  
		 */
		comments.setLineWrap(true);
		/**
		 * setLineWrap should be set true before setWrapStyleWord is set true. While
		 * setWrapStyleWord is set true, I can skip line based on where the last word
		 * entered.
		 */
		comments.setWrapStyleWord(true);
		add(comments);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new TextAreaDemo();
	}
	
}
